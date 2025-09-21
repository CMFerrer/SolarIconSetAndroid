package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Explicit: ImageVector
    get() {
        if (_explicit != null) {
            return _explicit!!
        }
        _explicit = Builder(
            name = "Explicit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 8.0f)
                curveTo(8.25f, 7.0335f, 9.0335f, 6.25f, 10.0f, 6.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 6.25f, 15.75f, 6.5858f, 15.75f, 7.0f)
                curveTo(15.75f, 7.4142f, 15.4142f, 7.75f, 15.0f, 7.75f)
                horizontalLineTo(10.0f)
                curveTo(9.8619f, 7.75f, 9.75f, 7.8619f, 9.75f, 8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 11.25f, 15.75f, 11.5858f, 15.75f, 12.0f)
                curveTo(15.75f, 12.4142f, 15.4142f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(16.0f)
                curveTo(9.75f, 16.1381f, 9.8619f, 16.25f, 10.0f, 16.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 16.25f, 15.75f, 16.5858f, 15.75f, 17.0f)
                curveTo(15.75f, 17.4142f, 15.4142f, 17.75f, 15.0f, 17.75f)
                horizontalLineTo(10.0f)
                curveTo(9.0335f, 17.75f, 8.25f, 16.9665f, 8.25f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _explicit!!
    }

private var _explicit: ImageVector? = null
