package dev.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(
            name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0348f, 10.9714f)
                curveTo(5.1085f, 9.7626f, 5.1453f, 9.1581f, 5.4585f, 8.5768f)
                curveTo(5.7447f, 8.0456f, 6.2923f, 7.5304f, 6.8399f, 7.2771f)
                curveTo(7.4392f, 6.9998f, 8.1262f, 6.9998f, 9.5001f, 6.9998f)
                curveTo(10.0122f, 6.9998f, 10.2682f, 6.9998f, 10.5162f, 6.9579f)
                curveTo(10.7614f, 6.9165f, 11.0005f, 6.8448f, 11.2279f, 6.7444f)
                curveTo(11.4581f, 6.6428f, 11.6718f, 6.5019f, 12.0993f, 6.22f)
                lineTo(12.3183f, 6.0757f)
                curveTo(14.8612f, 4.399f, 16.1327f, 3.5606f, 17.2001f, 3.9249f)
                curveTo(17.4047f, 3.9947f, 17.6028f, 4.0955f, 17.7797f, 4.2198f)
                curveTo(18.7024f, 4.8683f, 18.7725f, 6.377f, 18.9127f, 9.3944f)
                curveTo(18.9646f, 10.5117f, 19.0f, 11.4679f, 19.0f, 11.9998f)
                curveTo(19.0f, 12.5317f, 18.9646f, 13.4879f, 18.9127f, 14.6052f)
                curveTo(18.7725f, 17.6226f, 18.7024f, 19.1313f, 17.7797f, 19.7797f)
                curveTo(17.6028f, 19.9041f, 17.4047f, 20.0049f, 17.2001f, 20.0747f)
                curveTo(16.1327f, 20.4389f, 14.8612f, 19.6006f, 12.3183f, 17.9239f)
                lineTo(12.0993f, 17.7796f)
                curveTo(11.6718f, 17.4977f, 11.4581f, 17.3567f, 11.2279f, 17.2552f)
                curveTo(11.0005f, 17.1548f, 10.7614f, 17.0831f, 10.5162f, 17.0417f)
                curveTo(10.2682f, 16.9998f, 10.0122f, 16.9998f, 9.5001f, 16.9998f)
                curveTo(8.1262f, 16.9998f, 7.4392f, 16.9998f, 6.8399f, 16.7225f)
                curveTo(6.2923f, 16.4692f, 5.7447f, 15.9539f, 5.4585f, 15.4228f)
                curveTo(5.1453f, 14.8414f, 5.1085f, 14.237f, 5.0348f, 13.0282f)
                curveTo(5.013f, 12.6706f, 5.0f, 12.3222f, 5.0f, 11.9998f)
                curveTo(5.0f, 11.6774f, 5.013f, 11.329f, 5.0348f, 10.9714f)
                close()
            }
        }
            .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
