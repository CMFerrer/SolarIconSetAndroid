package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) {
            return _highDefinition!!
        }
        _highDefinition = Builder(
            name = "HighDefinition", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(6.25f, 8.0f)
                curveTo(6.25f, 7.5858f, 5.9142f, 7.25f, 5.5f, 7.25f)
                curveTo(5.0858f, 7.25f, 4.75f, 7.5858f, 4.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(4.75f, 16.4142f, 5.0858f, 16.75f, 5.5f, 16.75f)
                curveTo(5.9142f, 16.75f, 6.25f, 16.4142f, 6.25f, 16.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.5648f)
                verticalLineTo(16.0f)
                curveTo(9.5648f, 16.4142f, 9.9006f, 16.75f, 10.3148f, 16.75f)
                curveTo(10.729f, 16.75f, 11.0648f, 16.4142f, 11.0648f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(11.0648f, 7.5858f, 10.729f, 7.25f, 10.3148f, 7.25f)
                curveTo(9.9006f, 7.25f, 9.5648f, 7.5858f, 9.5648f, 8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(8.0f)
                close()
                moveTo(11.9722f, 8.8f)
                curveTo(11.9722f, 7.8198f, 12.8753f, 7.25f, 13.6852f, 7.25f)
                curveTo(16.6224f, 7.25f, 19.25f, 9.2525f, 19.25f, 12.0f)
                curveTo(19.25f, 14.7475f, 16.6224f, 16.75f, 13.6852f, 16.75f)
                curveTo(12.8753f, 16.75f, 11.9722f, 16.1802f, 11.9722f, 15.2f)
                verticalLineTo(8.8f)
                close()
                moveTo(13.4722f, 8.8215f)
                curveTo(13.4749f, 8.8188f, 13.4785f, 8.8153f, 13.4835f, 8.8112f)
                curveTo(13.5161f, 8.7842f, 13.585f, 8.75f, 13.6852f, 8.75f)
                curveTo(16.0663f, 8.75f, 17.75f, 10.3292f, 17.75f, 12.0f)
                curveTo(17.75f, 13.6708f, 16.0663f, 15.25f, 13.6852f, 15.25f)
                curveTo(13.585f, 15.25f, 13.5161f, 15.2159f, 13.4835f, 15.1888f)
                curveTo(13.4785f, 15.1847f, 13.4749f, 15.1812f, 13.4722f, 15.1785f)
                verticalLineTo(8.8215f)
                close()
            }
        }
            .build()
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
