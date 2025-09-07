package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(
            name = "Podcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.8373f, 10.5455f)
                curveTo(10.8373f, 10.1439f, 10.5249f, 9.8183f, 10.1396f, 9.8183f)
                horizontalLineTo(8.5815f)
                curveTo(8.9047f, 8.1585f, 10.3124f, 6.9092f, 12.0001f, 6.9092f)
                curveTo(13.6877f, 6.9092f, 15.0955f, 8.1585f, 15.4187f, 9.8183f)
                horizontalLineTo(12.9303f)
                curveTo(12.545f, 9.8183f, 12.2326f, 10.1439f, 12.2326f, 10.5455f)
                curveTo(12.2326f, 10.9472f, 12.545f, 11.2728f, 12.9303f, 11.2728f)
                horizontalLineTo(15.4885f)
                verticalLineTo(12.7274f)
                horizontalLineTo(12.9303f)
                curveTo(12.545f, 12.7274f, 12.2326f, 13.053f, 12.2326f, 13.4546f)
                curveTo(12.2326f, 13.8563f, 12.545f, 14.1819f, 12.9303f, 14.1819f)
                horizontalLineTo(15.4187f)
                curveTo(15.1412f, 15.6067f, 14.0646f, 16.729f, 12.6978f, 17.0183f)
                verticalLineTo(19.2728f)
                curveTo(12.6978f, 19.6745f, 12.3854f, 20.0001f, 12.0001f, 20.0001f)
                curveTo(11.6148f, 20.0001f, 11.3024f, 19.6745f, 11.3024f, 19.2728f)
                verticalLineTo(17.0183f)
                curveTo(9.9356f, 16.729f, 8.8589f, 15.6067f, 8.5815f, 14.1819f)
                horizontalLineTo(10.1396f)
                curveTo(10.5249f, 14.1819f, 10.8373f, 13.8563f, 10.8373f, 13.4546f)
                curveTo(10.8373f, 13.053f, 10.5249f, 12.7274f, 10.1396f, 12.7274f)
                horizontalLineTo(8.5117f)
                verticalLineTo(11.2728f)
                horizontalLineTo(10.1396f)
                curveTo(10.5249f, 11.2728f, 10.8373f, 10.9472f, 10.8373f, 10.5455f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(8.6705f, 4.0f, 5.9463f, 6.7013f, 5.7342f, 10.1161f)
                curveTo(5.3821f, 9.9257f, 4.9822f, 9.8182f, 4.5581f, 9.8182f)
                curveTo(3.1453f, 9.8182f, 2.0f, 11.0121f, 2.0f, 12.4848f)
                verticalLineTo(14.4242f)
                curveTo(2.0f, 15.897f, 3.1453f, 17.0909f, 4.5581f, 17.0909f)
                curveTo(4.6062f, 17.0909f, 4.6539f, 17.0895f, 4.7013f, 17.0868f)
                verticalLineTo(17.0909f)
                curveTo(6.035f, 17.0909f, 7.1163f, 15.9638f, 7.1163f, 14.5734f)
                verticalLineTo(10.5454f)
                curveTo(7.1163f, 7.7338f, 9.3028f, 5.4545f, 12.0f, 5.4545f)
                curveTo(14.6972f, 5.4545f, 16.8837f, 7.7338f, 16.8837f, 10.5454f)
                verticalLineTo(14.5734f)
                curveTo(16.8837f, 15.9638f, 17.9649f, 17.0909f, 19.2987f, 17.0909f)
                verticalLineTo(17.0868f)
                curveTo(19.3461f, 17.0895f, 19.3938f, 17.0909f, 19.4419f, 17.0909f)
                curveTo(20.8547f, 17.0909f, 22.0f, 15.897f, 22.0f, 14.4242f)
                verticalLineTo(12.4848f)
                curveTo(22.0f, 11.0121f, 20.8547f, 9.8182f, 19.4419f, 9.8182f)
                curveTo(19.0178f, 9.8182f, 18.6179f, 9.9257f, 18.2657f, 10.1161f)
                curveTo(18.0536f, 6.7013f, 15.3294f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
            .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
