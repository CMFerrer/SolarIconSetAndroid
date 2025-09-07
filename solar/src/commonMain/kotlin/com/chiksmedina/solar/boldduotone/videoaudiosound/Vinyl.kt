package com.chiksmedina.solar.boldduotone.videoaudiosound

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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.8184f, 3.3954f)
                curveTo(14.0109f, 3.2541f, 14.2592f, 3.2129f, 14.487f, 3.2845f)
                curveTo(17.4486f, 4.2147f, 19.7853f, 6.5513f, 20.7155f, 9.5129f)
                curveTo(20.8397f, 9.9081f, 20.6199f, 10.3291f, 20.2247f, 10.4532f)
                curveTo(19.8296f, 10.5773f, 19.4086f, 10.3576f, 19.2845f, 9.9624f)
                curveTo(18.6064f, 7.8037f, 17.0389f, 6.0373f, 15.0122f, 5.0937f)
                verticalLineTo(12.3689f)
                curveTo(15.0122f, 14.2363f, 13.4984f, 15.75f, 11.6311f, 15.75f)
                curveTo(9.7638f, 15.75f, 8.25f, 14.2363f, 8.25f, 12.3689f)
                curveTo(8.25f, 10.5016f, 9.7638f, 8.9879f, 11.6311f, 8.9879f)
                curveTo(12.3274f, 8.9879f, 12.9744f, 9.1983f, 13.5122f, 9.5591f)
                verticalLineTo(4.0f)
                curveTo(13.5122f, 3.7612f, 13.6259f, 3.5367f, 13.8184f, 3.3954f)
                close()
            }
        }
            .build()
        return _vinyl!!
    }

private var _vinyl: ImageVector? = null
