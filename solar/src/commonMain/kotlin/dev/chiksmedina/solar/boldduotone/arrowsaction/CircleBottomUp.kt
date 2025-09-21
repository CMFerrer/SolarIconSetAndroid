package dev.chiksmedina.solar.boldduotone.arrowsaction

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
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.CircleBottomUp: ImageVector
    get() {
        if (_circleBottomUp != null) {
            return _circleBottomUp!!
        }
        _circleBottomUp = Builder(
            name = "CircleBottomUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 13.0f)
                curveTo(4.25f, 12.5858f, 4.5858f, 12.25f, 5.0f, 12.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 12.25f, 11.75f, 12.5858f, 11.75f, 13.0f)
                verticalLineTo(19.0f)
                curveTo(11.75f, 19.4142f, 11.4142f, 19.75f, 11.0f, 19.75f)
                curveTo(10.5858f, 19.75f, 10.25f, 19.4142f, 10.25f, 19.0f)
                verticalLineTo(14.8107f)
                lineTo(3.5303f, 21.5303f)
                curveTo(3.2374f, 21.8232f, 2.7626f, 21.8232f, 2.4697f, 21.5303f)
                curveTo(2.1768f, 21.2374f, 2.1768f, 20.7626f, 2.4697f, 20.4697f)
                lineTo(9.1893f, 13.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 13.75f, 4.25f, 13.4142f, 4.25f, 13.0f)
                close()
            }
        }
            .build()
        return _circleBottomUp!!
    }

private var _circleBottomUp: ImageVector? = null
