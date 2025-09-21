package dev.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.ToPip: ImageVector
    get() {
        if (_toPip != null) {
            return _toPip!!
        }
        _toPip = Builder(
            name = "ToPip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.9962f, 21.0f)
                horizontalLineTo(9.9963f)
                curveTo(9.6047f, 21.0f, 9.2335f, 21.0f, 8.8813f, 20.9987f)
                curveTo(5.8411f, 20.9874f, 4.2178f, 20.8784f, 3.1678f, 19.8284f)
                curveTo(3.1008f, 19.7614f, 3.0376f, 19.6904f, 2.978f, 19.6153f)
                curveTo(2.1354f, 18.5939f, 2.0189f, 17.0574f, 2.0027f, 14.3804f)
                curveTo(2.0005f, 14.198f, 1.999f, 14.0344f, 2.0008f, 13.8872f)
                curveTo(2.0001f, 13.6036f, 2.0001f, 13.3081f, 2.0001f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0001f, 7.2288f, 2.0001f, 5.3432f, 3.1717f, 4.1716f)
                curveTo(4.3433f, 3.0f, 6.2289f, 3.0f, 10.0002f, 3.0f)
                horizontalLineTo(14.0002f)
                curveTo(17.7714f, 3.0f, 19.657f, 3.0f, 20.8286f, 4.1716f)
                curveTo(20.8956f, 4.2386f, 20.9589f, 4.3097f, 21.0185f, 4.3847f)
                curveTo(21.861f, 5.4061f, 21.9775f, 6.9426f, 21.9937f, 9.6196f)
                curveTo(21.9959f, 9.802f, 21.9974f, 9.9656f, 21.9956f, 10.1128f)
                curveTo(21.9962f, 10.3964f, 21.9962f, 10.6919f, 21.9962f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.9962f, 16.7712f, 21.9962f, 18.6569f, 20.8247f, 19.8284f)
                curveTo(19.6531f, 21.0f, 17.7675f, 21.0f, 13.9962f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0f)
                curveTo(13.0f, 15.1144f, 13.0f, 14.1716f, 13.5858f, 13.5858f)
                curveTo(14.1716f, 13.0f, 15.1144f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 13.0f, 20.8284f, 13.0f, 21.4142f, 13.5858f)
                curveTo(22.0f, 14.1716f, 22.0f, 15.1144f, 22.0f, 17.0f)
                curveTo(22.0f, 18.8856f, 22.0f, 19.8284f, 21.4142f, 20.4142f)
                curveTo(20.8284f, 21.0f, 19.8856f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(15.1144f, 21.0f, 14.1716f, 21.0f, 13.5858f, 20.4142f)
                curveTo(13.0f, 19.8284f, 13.0f, 18.8856f, 13.0f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0303f, 6.9697f)
                curveTo(7.7374f, 6.6768f, 7.2626f, 6.6768f, 6.9697f, 6.9697f)
                curveTo(6.6768f, 7.2626f, 6.6768f, 7.7374f, 6.9697f, 8.0303f)
                lineTo(9.6893f, 10.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 10.75f, 7.75f, 11.0858f, 7.75f, 11.5f)
                curveTo(7.75f, 11.9142f, 8.0858f, 12.25f, 8.5f, 12.25f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 12.25f, 12.25f, 11.9142f, 12.25f, 11.5f)
                verticalLineTo(8.5f)
                curveTo(12.25f, 8.0858f, 11.9142f, 7.75f, 11.5f, 7.75f)
                curveTo(11.0858f, 7.75f, 10.75f, 8.0858f, 10.75f, 8.5f)
                verticalLineTo(9.6893f)
                lineTo(8.0303f, 6.9697f)
                close()
            }
        }
            .build()
        return _toPip!!
    }

private var _toPip: ImageVector? = null
