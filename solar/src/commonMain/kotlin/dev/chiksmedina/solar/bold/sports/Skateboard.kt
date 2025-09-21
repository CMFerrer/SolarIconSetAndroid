package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(
            name = "Skateboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.5839f, 6.376f)
                curveTo(1.9286f, 6.1463f, 2.3942f, 6.2394f, 2.624f, 6.5841f)
                lineTo(3.4365f, 7.8029f)
                curveTo(4.0393f, 8.707f, 5.054f, 9.2501f, 6.1407f, 9.2501f)
                horizontalLineTo(17.8592f)
                curveTo(18.9459f, 9.2501f, 19.9606f, 8.707f, 20.5634f, 7.8028f)
                lineTo(21.3759f, 6.5841f)
                curveTo(21.6057f, 6.2394f, 22.0713f, 6.1463f, 22.416f, 6.376f)
                curveTo(22.7606f, 6.6058f, 22.8538f, 7.0715f, 22.624f, 7.4161f)
                lineTo(21.8115f, 8.6349f)
                curveTo(20.9305f, 9.9564f, 19.4474f, 10.7501f, 17.8592f, 10.7501f)
                horizontalLineTo(6.1407f)
                curveTo(4.5525f, 10.7501f, 3.0694f, 9.9564f, 2.1885f, 8.6349f)
                lineTo(1.3759f, 7.4161f)
                curveTo(1.1462f, 7.0715f, 1.2393f, 6.6058f, 1.5839f, 6.376f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 15.0001f)
                curveTo(9.0f, 16.1046f, 8.1045f, 17.0001f, 7.0f, 17.0001f)
                curveTo(5.8954f, 17.0001f, 5.0f, 16.1046f, 5.0f, 15.0001f)
                curveTo(5.0f, 13.8955f, 5.8954f, 13.0001f, 7.0f, 13.0001f)
                curveTo(8.1045f, 13.0001f, 9.0f, 13.8955f, 9.0f, 15.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 15.0001f)
                curveTo(19.0f, 16.1046f, 18.1045f, 17.0001f, 17.0f, 17.0001f)
                curveTo(15.8954f, 17.0001f, 15.0f, 16.1046f, 15.0f, 15.0001f)
                curveTo(15.0f, 13.8955f, 15.8954f, 13.0001f, 17.0f, 13.0001f)
                curveTo(18.1045f, 13.0001f, 19.0f, 13.8955f, 19.0f, 15.0001f)
                close()
            }
        }
            .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
