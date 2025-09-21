package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

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
                moveTo(10.8372f, 10.5455f)
                curveTo(10.8372f, 10.1438f, 10.5248f, 9.8182f, 10.1395f, 9.8182f)
                horizontalLineTo(8.5814f)
                curveTo(8.9046f, 8.1584f, 10.3124f, 6.9091f, 12.0f, 6.9091f)
                curveTo(13.6876f, 6.9091f, 15.0954f, 8.1584f, 15.4186f, 9.8182f)
                horizontalLineTo(12.9302f)
                curveTo(12.5449f, 9.8182f, 12.2326f, 10.1438f, 12.2326f, 10.5455f)
                curveTo(12.2326f, 10.9471f, 12.5449f, 11.2727f, 12.9302f, 11.2727f)
                horizontalLineTo(15.4884f)
                verticalLineTo(12.7273f)
                horizontalLineTo(12.9302f)
                curveTo(12.5449f, 12.7273f, 12.2326f, 13.0529f, 12.2326f, 13.4545f)
                curveTo(12.2326f, 13.8562f, 12.5449f, 14.1818f, 12.9302f, 14.1818f)
                horizontalLineTo(15.4186f)
                curveTo(15.1411f, 15.6066f, 14.0645f, 16.7289f, 12.6977f, 17.0182f)
                verticalLineTo(19.2727f)
                curveTo(12.6977f, 19.6744f, 12.3853f, 20.0f, 12.0f, 20.0f)
                curveTo(11.6147f, 20.0f, 11.3023f, 19.6744f, 11.3023f, 19.2727f)
                verticalLineTo(17.0182f)
                curveTo(9.9355f, 16.7289f, 8.8589f, 15.6066f, 8.5814f, 14.1818f)
                horizontalLineTo(10.1395f)
                curveTo(10.5248f, 14.1818f, 10.8372f, 13.8562f, 10.8372f, 13.4545f)
                curveTo(10.8372f, 13.0529f, 10.5248f, 12.7273f, 10.1395f, 12.7273f)
                horizontalLineTo(8.5116f)
                verticalLineTo(11.2727f)
                horizontalLineTo(10.1395f)
                curveTo(10.5248f, 11.2727f, 10.8372f, 10.9471f, 10.8372f, 10.5455f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
