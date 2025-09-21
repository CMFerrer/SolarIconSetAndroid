package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(
            name = "Telescope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.2429f, 6.1835f)
                lineTo(8.5592f, 8.2741f)
                curveTo(7.728f, 8.7459f, 7.3124f, 8.9817f, 7.2041f, 9.386f)
                curveTo(7.0958f, 9.7903f, 7.3378f, 10.2024f, 7.8218f, 11.0264f)
                lineTo(8.4175f, 12.0407f)
                curveTo(8.8885f, 12.8427f, 9.1241f, 13.2437f, 9.52f, 13.3497f)
                curveTo(9.9159f, 13.4558f, 10.3203f, 13.2263f, 11.1292f, 12.7672f)
                lineTo(14.8646f, 10.6472f)
                moveTo(7.0563f, 9.7226f)
                lineTo(3.4236f, 11.7843f)
                curveTo(2.5674f, 12.2702f, 2.1392f, 12.5132f, 2.0268f, 12.9256f)
                curveTo(1.9144f, 13.3381f, 2.1616f, 13.7589f, 2.6559f, 14.6006f)
                curveTo(3.1503f, 15.4423f, 3.3974f, 15.8631f, 3.817f, 15.9736f)
                curveTo(4.2366f, 16.0842f, 4.6647f, 15.8412f, 5.521f, 15.3552f)
                lineTo(9.1537f, 13.2935f)
                moveTo(21.3441f, 5.1849f)
                lineTo(20.2954f, 3.3994f)
                curveTo(19.8011f, 2.5577f, 19.5539f, 2.1369f, 19.1343f, 2.0264f)
                curveTo(18.7147f, 1.9158f, 18.2866f, 2.1588f, 17.4304f, 2.6448f)
                lineTo(13.7467f, 4.7354f)
                curveTo(12.9155f, 5.2071f, 12.4999f, 5.4429f, 12.3916f, 5.8472f)
                curveTo(12.2833f, 6.2516f, 12.5253f, 6.6636f, 13.0093f, 7.4877f)
                lineTo(14.1293f, 9.3947f)
                curveTo(14.6004f, 10.1966f, 14.8359f, 10.5976f, 15.2318f, 10.7037f)
                curveTo(15.6277f, 10.8098f, 16.0322f, 10.5802f, 16.841f, 10.1212f)
                lineTo(20.5764f, 8.0012f)
                curveTo(21.4326f, 7.5153f, 21.8608f, 7.2723f, 21.9732f, 6.8598f)
                curveTo(22.0856f, 6.4474f, 21.8384f, 6.0266f, 21.3441f, 5.1849f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                StrokeCap.Companion.Round, strokeLineJoin = Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 22.0f)
                lineTo(12.0f, 12.5f)
                lineTo(8.0f, 22.0f)
            }
        }
            .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
