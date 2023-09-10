package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.2222f, 21.0f)
                horizontalLineTo(9.7778f)
                curveTo(6.6568f, 21.0f, 5.0962f, 21.0f, 3.9752f, 20.2646f)
                curveTo(3.4899f, 19.9462f, 3.0733f, 19.5371f, 2.749f, 19.0607f)
                curveTo(2.0f, 17.9601f, 2.0f, 16.4279f, 2.0f, 13.3636f)
                curveTo(2.0f, 10.2994f, 2.0f, 8.7672f, 2.749f, 7.6666f)
                curveTo(3.0733f, 7.1901f, 3.4899f, 6.781f, 3.9752f, 6.4627f)
                curveTo(4.6955f, 5.9901f, 5.5973f, 5.8212f, 6.978f, 5.7609f)
                curveTo(7.6368f, 5.7609f, 8.2041f, 5.2707f, 8.3333f, 4.6364f)
                curveTo(8.5272f, 3.6849f, 9.378f, 3.0f, 10.3663f, 3.0f)
                horizontalLineTo(13.6337f)
                curveTo(14.6219f, 3.0f, 15.4728f, 3.6849f, 15.6667f, 4.6364f)
                curveTo(15.7959f, 5.2707f, 16.3631f, 5.7609f, 17.022f, 5.7609f)
                curveTo(18.4027f, 5.8212f, 19.3044f, 5.9901f, 20.0248f, 6.4627f)
                curveTo(20.51f, 6.781f, 20.9267f, 7.1901f, 21.251f, 7.6666f)
                curveTo(22.0f, 8.7672f, 22.0f, 10.2994f, 22.0f, 13.3636f)
                curveTo(22.0f, 16.4279f, 22.0f, 17.9601f, 21.251f, 19.0607f)
                curveTo(20.9267f, 19.5371f, 20.51f, 19.9462f, 20.0248f, 20.2646f)
                curveTo(18.9038f, 21.0f, 17.3433f, 21.0f, 14.2222f, 21.0f)
                close()
                moveTo(15.2697f, 9.5996f)
                curveTo(15.2697f, 9.1854f, 14.9339f, 8.8496f, 14.5197f, 8.8496f)
                curveTo(14.1055f, 8.8496f, 13.7697f, 9.1854f, 13.7697f, 9.5996f)
                verticalLineTo(9.7432f)
                curveTo(12.2996f, 8.9986f, 10.4581f, 9.2407f, 9.2295f, 10.4692f)
                curveTo(7.6995f, 11.9992f, 7.6995f, 14.4798f, 9.2295f, 16.0098f)
                curveTo(10.7595f, 17.5397f, 13.2401f, 17.5397f, 14.77f, 16.0098f)
                curveTo(15.421f, 15.3588f, 15.7957f, 14.5337f, 15.8923f, 13.6844f)
                curveTo(15.9391f, 13.2728f, 15.6434f, 12.9012f, 15.2319f, 12.8544f)
                curveTo(14.8203f, 12.8076f, 14.4487f, 13.1033f, 14.4019f, 13.5148f)
                curveTo(14.3422f, 14.0392f, 14.112f, 14.5465f, 13.7094f, 14.9491f)
                curveTo(12.7652f, 15.8933f, 11.2344f, 15.8933f, 10.2902f, 14.9491f)
                curveTo(9.346f, 14.0049f, 9.346f, 12.4741f, 10.2902f, 11.5299f)
                curveTo(10.9379f, 10.8822f, 11.8617f, 10.6788f, 12.6828f, 10.9198f)
                curveTo(12.3737f, 11.0637f, 12.1928f, 11.4061f, 12.2661f, 11.7542f)
                curveTo(12.3515f, 12.1595f, 12.7492f, 12.4189f, 13.1546f, 12.3335f)
                lineTo(14.6743f, 12.0135f)
                curveTo(15.0213f, 11.9404f, 15.2697f, 11.6342f, 15.2697f, 11.2796f)
                verticalLineTo(9.5996f)
                close()
            }
        }
            .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
