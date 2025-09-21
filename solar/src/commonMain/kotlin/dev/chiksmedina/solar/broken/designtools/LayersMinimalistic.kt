package dev.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.LayersMinimalistic: ImageVector
    get() {
        if (_layersMinimalistic != null) {
            return _layersMinimalistic!!
        }
        _layersMinimalistic = Builder(
            name = "LayersMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 12.0f, 21.0071f, 12.8907f, 19.0212f, 13.6851f)
                lineTo(16.2127f, 14.8085f)
                curveTo(14.2268f, 15.6028f, 13.2339f, 16.0f, 12.0f, 16.0f)
                curveTo(10.7661f, 16.0f, 9.7732f, 15.6028f, 7.7873f, 14.8085f)
                lineTo(4.9788f, 13.6851f)
                curveTo(2.9929f, 12.8907f, 2.0f, 12.0f, 2.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 16.0f)
                curveTo(2.0f, 16.0f, 2.9929f, 16.8907f, 4.9788f, 17.6851f)
                lineTo(7.7873f, 18.8085f)
                curveTo(9.7732f, 19.6028f, 10.7661f, 20.0f, 12.0f, 20.0f)
                curveTo(12.9539f, 20.0f, 13.7639f, 19.7626f, 15.0f, 19.2878f)
                moveTo(19.0212f, 17.6851f)
                curveTo(21.0071f, 16.8907f, 22.0f, 16.0f, 22.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.9788f, 6.3149f)
                curveTo(2.9929f, 7.1093f, 2.0f, 7.5065f, 2.0f, 8.0f)
                curveTo(2.0f, 8.4936f, 2.9929f, 8.8907f, 4.9788f, 9.6851f)
                lineTo(7.7873f, 10.8085f)
                curveTo(9.7732f, 11.6028f, 10.7661f, 12.0f, 12.0f, 12.0f)
                curveTo(13.2339f, 12.0f, 14.2268f, 11.6028f, 16.2127f, 10.8085f)
                lineTo(19.0212f, 9.6851f)
                curveTo(21.0071f, 8.8907f, 22.0f, 8.4936f, 22.0f, 8.0f)
                curveTo(22.0f, 7.5065f, 21.0071f, 7.1093f, 19.0212f, 6.3149f)
                lineTo(16.2127f, 5.1915f)
                curveTo(14.2268f, 4.3972f, 13.2339f, 4.0f, 12.0f, 4.0f)
                curveTo(11.0461f, 4.0f, 10.2361f, 4.2374f, 9.0f, 4.7122f)
            }
        }
            .build()
        return _layersMinimalistic!!
    }

private var _layersMinimalistic: ImageVector? = null
