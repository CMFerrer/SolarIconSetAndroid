package dev.chiksmedina.solar.bold.designtools

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
import dev.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(
            name = "Layers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.9788f, 9.6851f)
                curveTo(2.9929f, 8.8907f, 2.0f, 8.4936f, 2.0f, 8.0f)
                curveTo(2.0f, 7.5065f, 2.9929f, 7.1093f, 4.9788f, 6.3149f)
                lineTo(7.7873f, 5.1915f)
                curveTo(9.7732f, 4.3972f, 10.7661f, 4.0f, 12.0f, 4.0f)
                curveTo(13.2339f, 4.0f, 14.2268f, 4.3972f, 16.2127f, 5.1915f)
                lineTo(19.0212f, 6.3149f)
                curveTo(21.0071f, 7.1093f, 22.0f, 7.5065f, 22.0f, 8.0f)
                curveTo(22.0f, 8.4936f, 21.0071f, 8.8907f, 19.0212f, 9.6851f)
                lineTo(16.2127f, 10.8085f)
                curveTo(14.2268f, 11.6028f, 13.2339f, 12.0f, 12.0f, 12.0f)
                curveTo(10.7661f, 12.0f, 9.7732f, 11.6028f, 7.7873f, 10.8085f)
                lineTo(4.9788f, 9.6851f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 8.4936f, 2.9929f, 8.8907f, 4.9788f, 9.6851f)
                lineTo(7.7873f, 10.8085f)
                curveTo(9.7732f, 11.6028f, 10.7661f, 12.0f, 12.0f, 12.0f)
                curveTo(13.2339f, 12.0f, 14.2268f, 11.6028f, 16.2127f, 10.8085f)
                lineTo(19.0212f, 9.6851f)
                curveTo(21.0071f, 8.8907f, 22.0f, 8.4936f, 22.0f, 8.0f)
                curveTo(22.0f, 7.5065f, 21.0071f, 7.1093f, 19.0212f, 6.3149f)
                lineTo(16.2127f, 5.1915f)
                curveTo(14.2268f, 4.3972f, 13.2339f, 4.0f, 12.0f, 4.0f)
                curveTo(10.7661f, 4.0f, 9.7732f, 4.3972f, 7.7873f, 5.1915f)
                lineTo(4.9788f, 6.3149f)
                curveTo(2.9929f, 7.1093f, 2.0f, 7.5065f, 2.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0212f, 13.6851f)
                lineTo(16.2127f, 14.8085f)
                curveTo(14.2268f, 15.6028f, 13.2339f, 16.0f, 12.0f, 16.0f)
                curveTo(10.7661f, 16.0f, 9.7732f, 15.6028f, 7.7873f, 14.8085f)
                lineTo(4.9788f, 13.6851f)
                curveTo(2.9929f, 12.8907f, 2.0f, 12.4935f, 2.0f, 12.0f)
                curveTo(2.0f, 11.5551f, 2.8068f, 11.1885f, 4.4204f, 10.5388f)
                lineTo(7.5614f, 11.7952f)
                curveTo(9.4101f, 12.535f, 10.572f, 13.0f, 12.0f, 13.0f)
                curveTo(13.428f, 13.0f, 14.5899f, 12.535f, 16.4386f, 11.7952f)
                lineTo(19.5796f, 10.5388f)
                curveTo(21.1932f, 11.1885f, 22.0f, 11.5551f, 22.0f, 12.0f)
                curveTo(22.0f, 12.4935f, 21.0071f, 12.8907f, 19.0212f, 13.6851f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0212f, 17.6849f)
                lineTo(16.2127f, 18.8083f)
                curveTo(14.2268f, 19.6026f, 13.2339f, 19.9998f, 12.0f, 19.9998f)
                curveTo(10.7661f, 19.9998f, 9.7732f, 19.6026f, 7.7873f, 18.8083f)
                lineTo(4.9788f, 17.6849f)
                curveTo(2.9929f, 16.8905f, 2.0f, 16.4934f, 2.0f, 15.9998f)
                curveTo(2.0f, 15.5549f, 2.8068f, 15.1883f, 4.4204f, 14.5386f)
                lineTo(7.5614f, 15.795f)
                curveTo(9.4101f, 16.5348f, 10.572f, 16.9998f, 12.0f, 16.9998f)
                curveTo(13.428f, 16.9998f, 14.5899f, 16.5348f, 16.4386f, 15.795f)
                lineTo(19.5796f, 14.5386f)
                curveTo(21.1932f, 15.1883f, 22.0f, 15.5549f, 22.0f, 15.9998f)
                curveTo(22.0f, 16.4934f, 21.0071f, 16.8905f, 19.0212f, 17.6849f)
                close()
            }
        }
            .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
