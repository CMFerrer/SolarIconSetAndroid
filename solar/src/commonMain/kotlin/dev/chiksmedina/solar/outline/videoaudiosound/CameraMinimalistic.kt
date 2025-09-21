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

val VideoAudioSoundGroup.CameraMinimalistic: ImageVector
    get() {
        if (_cameraMinimalistic != null) {
            return _cameraMinimalistic!!
        }
        _cameraMinimalistic = Builder(
            name = "CameraMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.75f, 3.5f)
                curveTo(8.75f, 3.0858f, 9.0858f, 2.75f, 9.5f, 2.75f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 2.75f, 15.25f, 3.0858f, 15.25f, 3.5f)
                curveTo(15.25f, 3.9142f, 14.9142f, 4.25f, 14.5f, 4.25f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 4.25f, 8.75f, 3.9142f, 8.75f, 3.5f)
                close()
                moveTo(9.9583f, 5.2502f)
                horizontalLineTo(14.0414f)
                curveTo(15.4106f, 5.2502f, 16.4955f, 5.2502f, 17.3619f, 5.3383f)
                curveTo(18.2496f, 5.4286f, 18.9906f, 5.6176f, 19.6388f, 6.0507f)
                curveTo(20.1575f, 6.3973f, 20.6028f, 6.8426f, 20.9493f, 7.3613f)
                curveTo(21.3824f, 8.0094f, 21.5715f, 8.7504f, 21.6618f, 9.638f)
                curveTo(21.75f, 10.5047f, 21.75f, 11.5901f, 21.75f, 12.9601f)
                verticalLineTo(13.0416f)
                curveTo(21.75f, 14.4108f, 21.75f, 15.4957f, 21.6619f, 16.3621f)
                curveTo(21.5716f, 17.2497f, 21.3826f, 17.9907f, 20.9495f, 18.639f)
                curveTo(20.6029f, 19.1576f, 20.1576f, 19.6029f, 19.639f, 19.9495f)
                curveTo(18.9907f, 20.3826f, 18.2497f, 20.5716f, 17.3621f, 20.6619f)
                curveTo(16.4957f, 20.75f, 15.4108f, 20.75f, 14.0416f, 20.75f)
                horizontalLineTo(9.9584f)
                curveTo(8.5892f, 20.75f, 7.5043f, 20.75f, 6.6379f, 20.6619f)
                curveTo(5.7503f, 20.5716f, 5.0093f, 20.3826f, 4.361f, 19.9495f)
                curveTo(3.8424f, 19.6029f, 3.3971f, 19.1576f, 3.0505f, 18.639f)
                curveTo(2.6174f, 17.9907f, 2.4284f, 17.2497f, 2.3381f, 16.3621f)
                curveTo(2.25f, 15.4957f, 2.25f, 14.4108f, 2.25f, 13.0416f)
                verticalLineTo(12.9566f)
                curveTo(2.25f, 11.588f, 2.25f, 10.5035f, 2.3381f, 9.6375f)
                curveTo(2.4284f, 8.7502f, 2.6173f, 8.0093f, 3.0504f, 7.3613f)
                curveTo(3.3969f, 6.8426f, 3.8422f, 6.3973f, 4.3609f, 6.0507f)
                curveTo(5.0091f, 5.6176f, 5.7502f, 5.4286f, 6.6378f, 5.3383f)
                curveTo(7.5041f, 5.2502f, 8.5891f, 5.2502f, 9.9583f, 5.2502f)
                close()
                moveTo(6.7896f, 6.8306f)
                curveTo(6.0206f, 6.9089f, 5.5549f, 7.057f, 5.1943f, 7.2979f)
                curveTo(4.8394f, 7.5351f, 4.5347f, 7.8397f, 4.2976f, 8.1946f)
                curveTo(4.0566f, 8.5552f, 3.9086f, 9.0206f, 3.8304f, 9.7893f)
                curveTo(3.7509f, 10.5706f, 3.75f, 11.5787f, 3.75f, 12.9981f)
                verticalLineTo(13.0f)
                curveTo(3.75f, 14.4201f, 3.7509f, 15.4287f, 3.8304f, 16.2102f)
                curveTo(3.9086f, 16.9793f, 4.0567f, 17.4449f, 4.2977f, 17.8056f)
                curveTo(4.5348f, 18.1605f, 4.8395f, 18.4652f, 5.1944f, 18.7023f)
                curveTo(5.5551f, 18.9433f, 6.0207f, 19.0914f, 6.7898f, 19.1696f)
                curveTo(7.5713f, 19.2491f, 8.5799f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(15.4201f, 19.25f, 16.4287f, 19.2491f, 17.2102f, 19.1696f)
                curveTo(17.9793f, 19.0914f, 18.4449f, 18.9433f, 18.8056f, 18.7023f)
                curveTo(19.1605f, 18.4652f, 19.4652f, 18.1605f, 19.7023f, 17.8056f)
                curveTo(19.9433f, 17.4449f, 20.0914f, 16.9793f, 20.1696f, 16.2102f)
                curveTo(20.2491f, 15.4287f, 20.25f, 14.4201f, 20.25f, 13.0f)
                curveTo(20.25f, 11.5799f, 20.2491f, 10.5714f, 20.1695f, 9.7899f)
                curveTo(20.0913f, 9.0209f, 19.9431f, 8.5553f, 19.7021f, 8.1946f)
                curveTo(19.465f, 7.8397f, 19.1603f, 7.5351f, 18.8055f, 7.2979f)
                curveTo(18.4448f, 7.057f, 17.9791f, 6.9089f, 17.2101f, 6.8306f)
                curveTo(16.4285f, 6.7511f, 15.4199f, 6.7502f, 13.9999f, 6.7502f)
                horizontalLineTo(9.9999f)
                curveTo(8.5798f, 6.7502f, 7.5712f, 6.7511f, 6.7896f, 6.8306f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(10.7574f, 10.75f, 9.75f, 11.7574f, 9.75f, 13.0f)
                curveTo(9.75f, 14.2426f, 10.7574f, 15.25f, 12.0f, 15.25f)
                curveTo(13.2426f, 15.25f, 14.25f, 14.2426f, 14.25f, 13.0f)
                curveTo(14.25f, 11.7574f, 13.2426f, 10.75f, 12.0f, 10.75f)
                close()
                moveTo(8.25f, 13.0f)
                curveTo(8.25f, 10.9289f, 9.9289f, 9.25f, 12.0f, 9.25f)
                curveTo(14.0711f, 9.25f, 15.75f, 10.9289f, 15.75f, 13.0f)
                curveTo(15.75f, 15.0711f, 14.0711f, 16.75f, 12.0f, 16.75f)
                curveTo(9.9289f, 16.75f, 8.25f, 15.0711f, 8.25f, 13.0f)
                close()
                moveTo(16.75f, 10.0f)
                curveTo(16.75f, 9.5858f, 17.0858f, 9.25f, 17.5f, 9.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 9.25f, 18.75f, 9.5858f, 18.75f, 10.0f)
                curveTo(18.75f, 10.4142f, 18.4142f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(17.5f)
                curveTo(17.0858f, 10.75f, 16.75f, 10.4142f, 16.75f, 10.0f)
                close()
            }
        }
            .build()
        return _cameraMinimalistic!!
    }

private var _cameraMinimalistic: ImageVector? = null
