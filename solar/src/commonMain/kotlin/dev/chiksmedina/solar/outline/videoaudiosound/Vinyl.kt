package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Vinyl: ImageVector
    get() {
        if (_vinyl != null) {
            return _vinyl!!
        }
        _vinyl = Builder(
            name = "Vinyl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.7463f, 1.9758f)
                curveTo(11.7873f, 2.3879f, 11.4863f, 2.7553f, 11.0741f, 2.7962f)
                curveTo(6.4006f, 3.2602f, 2.75f, 7.2045f, 2.75f, 12.0005f)
                curveTo(2.75f, 17.1091f, 6.8914f, 21.2505f, 12.0f, 21.2505f)
                curveTo(16.796f, 21.2505f, 20.7403f, 17.5999f, 21.2043f, 12.9264f)
                curveTo(21.2452f, 12.5142f, 21.6125f, 12.2132f, 22.0247f, 12.2542f)
                curveTo(22.4369f, 12.2951f, 22.7379f, 12.6624f, 22.697f, 13.0746f)
                curveTo(22.1575f, 18.5077f, 17.5747f, 22.7505f, 12.0f, 22.7505f)
                curveTo(6.0629f, 22.7505f, 1.25f, 17.9375f, 1.25f, 12.0005f)
                curveTo(1.25f, 6.4258f, 5.4928f, 1.843f, 10.9259f, 1.3035f)
                curveTo(11.3381f, 1.2626f, 11.7054f, 1.5636f, 11.7463f, 1.9758f)
                close()
                moveTo(14.5562f, 1.8534f)
                curveTo(14.7487f, 1.7121f, 14.9969f, 1.6709f, 15.2247f, 1.7425f)
                curveTo(18.5688f, 2.7928f, 21.2074f, 5.4314f, 22.2577f, 8.7755f)
                curveTo(22.3819f, 9.1706f, 22.1621f, 9.5916f, 21.7669f, 9.7157f)
                curveTo(21.3718f, 9.8399f, 20.9508f, 9.6201f, 20.8267f, 9.2249f)
                curveTo(20.0281f, 6.6823f, 18.1597f, 4.6118f, 15.75f, 3.5417f)
                verticalLineTo(12.0005f)
                curveTo(15.75f, 14.0716f, 14.0711f, 15.7505f, 12.0f, 15.7505f)
                curveTo(9.9289f, 15.7505f, 8.25f, 14.0716f, 8.25f, 12.0005f)
                curveTo(8.25f, 9.9294f, 9.9289f, 8.2505f, 12.0f, 8.2505f)
                curveTo(12.8442f, 8.2505f, 13.6233f, 8.5294f, 14.25f, 9.0002f)
                verticalLineTo(2.458f)
                curveTo(14.25f, 2.2192f, 14.3637f, 1.9947f, 14.5562f, 1.8534f)
                close()
                moveTo(14.25f, 12.0005f)
                curveTo(14.25f, 10.7578f, 13.2426f, 9.7505f, 12.0f, 9.7505f)
                curveTo(10.7574f, 9.7505f, 9.75f, 10.7578f, 9.75f, 12.0005f)
                curveTo(9.75f, 13.2431f, 10.7574f, 14.2505f, 12.0f, 14.2505f)
                curveTo(13.2426f, 14.2505f, 14.25f, 13.2431f, 14.25f, 12.0005f)
                close()
            }
        }
            .build()
        return _vinyl!!
    }

private var _vinyl: ImageVector? = null
