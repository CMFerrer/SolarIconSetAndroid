package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                pathFillType = NonZero
            ) {
                moveTo(11.6311f, 10.4879f)
                curveTo(12.67f, 10.4879f, 13.5122f, 11.3301f, 13.5122f, 12.3689f)
                curveTo(13.5122f, 13.4078f, 12.67f, 14.25f, 11.6311f, 14.25f)
                curveTo(10.5922f, 14.25f, 9.75f, 13.4078f, 9.75f, 12.3689f)
                curveTo(9.75f, 11.3301f, 10.5922f, 10.4879f, 11.6311f, 10.4879f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.487f, 3.2845f)
                curveTo(14.2592f, 3.2129f, 14.0109f, 3.2541f, 13.8184f, 3.3954f)
                curveTo(13.6259f, 3.5367f, 13.5122f, 3.7612f, 13.5122f, 4.0f)
                verticalLineTo(9.5591f)
                curveTo(12.9744f, 9.1983f, 12.3274f, 8.9879f, 11.6311f, 8.9879f)
                curveTo(9.7638f, 8.9879f, 8.25f, 10.5016f, 8.25f, 12.3689f)
                curveTo(8.25f, 14.2363f, 9.7638f, 15.75f, 11.6311f, 15.75f)
                curveTo(13.4984f, 15.75f, 15.0122f, 14.2363f, 15.0122f, 12.3689f)
                verticalLineTo(5.0937f)
                curveTo(17.0389f, 6.0373f, 18.6064f, 7.8037f, 19.2845f, 9.9624f)
                curveTo(19.4086f, 10.3576f, 19.8296f, 10.5773f, 20.2247f, 10.4532f)
                curveTo(20.6199f, 10.3291f, 20.8397f, 9.9081f, 20.7155f, 9.5129f)
                curveTo(19.7853f, 6.5513f, 17.4486f, 4.2147f, 14.487f, 3.2845f)
                close()
            }
        }
            .build()
        return _vinyl!!
    }

private var _vinyl: ImageVector? = null
