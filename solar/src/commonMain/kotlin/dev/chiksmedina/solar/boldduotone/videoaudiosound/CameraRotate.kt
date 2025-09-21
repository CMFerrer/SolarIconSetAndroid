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

val VideoAudioSoundGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(
            name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.7778f, 21.0f)
                horizontalLineTo(14.2222f)
                curveTo(17.3433f, 21.0f, 18.9038f, 21.0f, 20.0248f, 20.2646f)
                curveTo(20.51f, 19.9462f, 20.9267f, 19.5371f, 21.251f, 19.0607f)
                curveTo(22.0f, 17.9601f, 22.0f, 16.4279f, 22.0f, 13.3636f)
                curveTo(22.0f, 10.2994f, 22.0f, 8.7672f, 21.251f, 7.6666f)
                curveTo(20.9267f, 7.1901f, 20.51f, 6.781f, 20.0248f, 6.4627f)
                curveTo(19.3044f, 5.9901f, 18.4027f, 5.8212f, 17.022f, 5.7609f)
                curveTo(16.3631f, 5.7609f, 15.7959f, 5.2707f, 15.6667f, 4.6364f)
                curveTo(15.4728f, 3.6849f, 14.6219f, 3.0f, 13.6337f, 3.0f)
                horizontalLineTo(10.3663f)
                curveTo(9.378f, 3.0f, 8.5272f, 3.6849f, 8.3333f, 4.6364f)
                curveTo(8.2041f, 5.2707f, 7.6368f, 5.7609f, 6.978f, 5.7609f)
                curveTo(5.5973f, 5.8212f, 4.6955f, 5.9901f, 3.9752f, 6.4627f)
                curveTo(3.4899f, 6.781f, 3.0733f, 7.1901f, 2.749f, 7.6666f)
                curveTo(2.0f, 8.7672f, 2.0f, 10.2994f, 2.0f, 13.3636f)
                curveTo(2.0f, 16.4279f, 2.0f, 17.9601f, 2.749f, 19.0607f)
                curveTo(3.0733f, 19.5371f, 3.4899f, 19.9462f, 3.9752f, 20.2646f)
                curveTo(5.0962f, 21.0f, 6.6568f, 21.0f, 9.7778f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5197f, 8.8496f)
                curveTo(14.9339f, 8.8496f, 15.2697f, 9.1854f, 15.2697f, 9.5996f)
                verticalLineTo(11.2796f)
                curveTo(15.2697f, 11.6342f, 15.0213f, 11.9404f, 14.6743f, 12.0135f)
                lineTo(13.1546f, 12.3335f)
                curveTo(12.7492f, 12.4189f, 12.3515f, 12.1595f, 12.2661f, 11.7542f)
                curveTo(12.1928f, 11.4061f, 12.3737f, 11.0637f, 12.6828f, 10.9198f)
                curveTo(11.8617f, 10.6788f, 10.9379f, 10.8822f, 10.2902f, 11.5299f)
                curveTo(9.346f, 12.4741f, 9.346f, 14.0049f, 10.2902f, 14.9491f)
                curveTo(11.2344f, 15.8933f, 12.7652f, 15.8933f, 13.7094f, 14.9491f)
                curveTo(14.112f, 14.5465f, 14.3422f, 14.0392f, 14.4019f, 13.5148f)
                curveTo(14.4487f, 13.1033f, 14.8203f, 12.8076f, 15.2319f, 12.8544f)
                curveTo(15.6434f, 12.9012f, 15.9391f, 13.2728f, 15.8923f, 13.6844f)
                curveTo(15.7957f, 14.5337f, 15.421f, 15.3588f, 14.77f, 16.0098f)
                curveTo(13.2401f, 17.5397f, 10.7595f, 17.5397f, 9.2295f, 16.0098f)
                curveTo(7.6995f, 14.4798f, 7.6995f, 11.9992f, 9.2295f, 10.4692f)
                curveTo(10.4581f, 9.2407f, 12.2996f, 8.9986f, 13.7697f, 9.7432f)
                verticalLineTo(9.5996f)
                curveTo(13.7697f, 9.1854f, 14.1055f, 8.8496f, 14.5197f, 8.8496f)
                close()
            }
        }
            .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
