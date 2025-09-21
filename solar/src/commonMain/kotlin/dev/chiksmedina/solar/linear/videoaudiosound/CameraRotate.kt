package dev.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5197f, 10.6799f)
                lineTo(14.2397f, 10.4f)
                curveTo(13.0026f, 9.1629f, 10.9969f, 9.1629f, 9.7598f, 10.4f)
                curveTo(8.5228f, 11.637f, 8.5228f, 13.6427f, 9.7598f, 14.8798f)
                curveTo(10.9969f, 16.1169f, 13.0026f, 16.1169f, 14.2397f, 14.8798f)
                curveTo(14.7665f, 14.353f, 15.069f, 13.6868f, 15.1471f, 13.0f)
                moveTo(14.5197f, 10.6799f)
                lineTo(13.0f, 11.0f)
                moveTo(14.5197f, 10.6799f)
                verticalLineTo(9.0f)
            }
        }
            .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
