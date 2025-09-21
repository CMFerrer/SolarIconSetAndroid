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

val VideoAudioSoundGroup.Pip: ImageVector
    get() {
        if (_pip != null) {
            return _pip!!
        }
        _pip = Builder(
            name = "Pip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.996f, 21.0f)
                horizontalLineTo(9.996f)
                curveTo(9.6045f, 21.0f, 9.2332f, 21.0f, 8.881f, 20.9987f)
                curveTo(5.8409f, 20.9874f, 4.2175f, 20.8784f, 3.1676f, 19.8284f)
                curveTo(3.1005f, 19.7614f, 3.0373f, 19.6904f, 2.9777f, 19.6153f)
                curveTo(2.1352f, 18.5939f, 2.0186f, 17.0574f, 2.0025f, 14.3804f)
                curveTo(2.0002f, 14.198f, 1.9988f, 14.0344f, 2.0006f, 13.8872f)
                curveTo(1.9999f, 13.6036f, 1.9999f, 13.3081f, 1.9999f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(1.9999f, 7.2288f, 1.9999f, 5.3432f, 3.1715f, 4.1716f)
                curveTo(4.3431f, 3.0f, 6.2287f, 3.0f, 9.9999f, 3.0f)
                horizontalLineTo(13.9999f)
                curveTo(17.7711f, 3.0f, 19.6568f, 3.0f, 20.8283f, 4.1716f)
                curveTo(20.8954f, 4.2386f, 20.9586f, 4.3097f, 21.0182f, 4.3847f)
                curveTo(21.8607f, 5.4061f, 21.9773f, 6.9426f, 21.9934f, 9.6196f)
                curveTo(21.9957f, 9.802f, 21.9971f, 9.9656f, 21.9954f, 10.1128f)
                curveTo(21.996f, 10.3964f, 21.996f, 10.6919f, 21.996f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(21.996f, 16.7712f, 21.996f, 18.6569f, 20.8244f, 19.8284f)
                curveTo(19.6529f, 21.0f, 17.7672f, 21.0f, 13.996f, 21.0f)
                close()
            }
        }
            .build()
        return _pip!!
    }

private var _pip: ImageVector? = null
