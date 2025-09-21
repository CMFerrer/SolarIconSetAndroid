package dev.chiksmedina.solar.boldduotone.videoaudiosound

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
import dev.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.UploadTrack2: ImageVector
    get() {
        if (_uploadTrack2 != null) {
            return _uploadTrack2!!
        }
        _uploadTrack2 = Builder(
            name = "UploadTrack2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.75f, 21.2731f)
                curveTo(14.592f, 21.7419f, 13.3261f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 13.1455f, 21.8074f, 14.246f, 21.4528f, 15.2709f)
                lineTo(19.591f, 13.409f)
                curveTo(18.7123f, 12.5303f, 17.2877f, 12.5303f, 16.409f, 13.409f)
                lineTo(13.909f, 15.909f)
                curveTo(13.0303f, 16.7877f, 13.0303f, 18.2123f, 13.909f, 19.091f)
                curveTo(14.412f, 19.594f, 15.094f, 19.8091f, 15.75f, 19.7362f)
                verticalLineTo(21.2731f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.75f, 7.0f)
                curveTo(13.75f, 6.5858f, 13.4142f, 6.25f, 13.0f, 6.25f)
                curveTo(12.5858f, 6.25f, 12.25f, 6.5858f, 12.25f, 7.0f)
                verticalLineTo(12.5499f)
                curveTo(11.875f, 12.3581f, 11.4501f, 12.25f, 11.0f, 12.25f)
                curveTo(9.4812f, 12.25f, 8.25f, 13.4812f, 8.25f, 15.0f)
                curveTo(8.25f, 16.5188f, 9.4812f, 17.75f, 11.0f, 17.75f)
                curveTo(12.5188f, 17.75f, 13.75f, 16.5188f, 13.75f, 15.0f)
                verticalLineTo(10.0003f)
                curveTo(14.3767f, 10.471f, 15.1558f, 10.75f, 16.0f, 10.75f)
                curveTo(16.4142f, 10.75f, 16.75f, 10.4142f, 16.75f, 10.0f)
                curveTo(16.75f, 9.5858f, 16.4142f, 9.25f, 16.0f, 9.25f)
                curveTo(14.7574f, 9.25f, 13.75f, 8.2426f, 13.75f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.4697f, 14.4697f)
                curveTo(17.7626f, 14.1768f, 18.2374f, 14.1768f, 18.5303f, 14.4697f)
                lineTo(21.0303f, 16.9697f)
                curveTo(21.3232f, 17.2626f, 21.3232f, 17.7374f, 21.0303f, 18.0303f)
                curveTo(20.7374f, 18.3232f, 20.2626f, 18.3232f, 19.9697f, 18.0303f)
                lineTo(18.75f, 16.8107f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(16.8107f)
                lineTo(16.0303f, 18.0303f)
                curveTo(15.7374f, 18.3232f, 15.2626f, 18.3232f, 14.9697f, 18.0303f)
                curveTo(14.6768f, 17.7374f, 14.6768f, 17.2626f, 14.9697f, 16.9697f)
                lineTo(17.4697f, 14.4697f)
                close()
            }
        }
            .build()
        return _uploadTrack2!!
    }

private var _uploadTrack2: ImageVector? = null
