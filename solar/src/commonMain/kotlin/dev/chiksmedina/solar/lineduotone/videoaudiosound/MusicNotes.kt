package dev.chiksmedina.solar.lineduotone.videoaudiosound

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
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) {
            return _musicNotes!!
        }
        _musicNotes = Builder(
            name = "MusicNotes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.5f)
                curveTo(12.0f, 20.8807f, 10.8807f, 22.0f, 9.5f, 22.0f)
                curveTo(8.1193f, 22.0f, 7.0f, 20.8807f, 7.0f, 19.5f)
                curveTo(7.0f, 18.1193f, 8.1193f, 17.0f, 9.5f, 17.0f)
                curveTo(10.8807f, 17.0f, 12.0f, 18.1193f, 12.0f, 19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 17.5f)
                curveTo(22.0f, 18.8807f, 20.8807f, 20.0f, 19.5f, 20.0f)
                curveTo(18.1193f, 20.0f, 17.0f, 18.8807f, 17.0f, 17.5f)
                curveTo(17.0f, 16.1193f, 18.1193f, 15.0f, 19.5f, 15.0f)
                curveTo(20.8807f, 15.0f, 22.0f, 16.1193f, 22.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 8.0f)
                lineTo(12.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4556f, 5.158f)
                lineTo(14.7452f, 5.8499f)
                lineTo(14.7452f, 5.8499f)
                lineTo(14.4556f, 5.158f)
                close()
                moveTo(16.4556f, 4.3209f)
                lineTo(16.1661f, 3.6291f)
                lineTo(16.4556f, 4.3209f)
                close()
                moveTo(21.1081f, 3.3406f)
                lineTo(20.6925f, 3.965f)
                lineTo(20.6925f, 3.965f)
                lineTo(21.1081f, 3.3406f)
                close()
                moveTo(12.75f, 19.0004f)
                verticalLineTo(8.8479f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.0004f)
                horizontalLineTo(12.75f)
                close()
                moveTo(22.75f, 17.1542f)
                verticalLineTo(8.0108f)
                horizontalLineTo(21.25f)
                verticalLineTo(17.1542f)
                horizontalLineTo(22.75f)
                close()
                moveTo(14.7452f, 5.8499f)
                lineTo(16.7452f, 5.0128f)
                lineTo(16.1661f, 3.6291f)
                lineTo(14.1661f, 4.4662f)
                lineTo(14.7452f, 5.8499f)
                close()
                moveTo(22.75f, 8.0108f)
                curveTo(22.75f, 6.6767f, 22.752f, 5.5909f, 22.6304f, 4.7694f)
                curveTo(22.5067f, 3.9333f, 22.2308f, 3.1869f, 21.5236f, 2.7162f)
                lineTo(20.6925f, 3.965f)
                curveTo(20.8772f, 4.0879f, 21.0473f, 4.3177f, 21.1466f, 4.9889f)
                curveTo(21.248f, 5.6746f, 21.25f, 6.6272f, 21.25f, 8.0108f)
                horizontalLineTo(22.75f)
                close()
                moveTo(16.7452f, 5.0128f)
                curveTo(18.0215f, 4.4786f, 18.901f, 4.1126f, 19.5727f, 3.9415f)
                curveTo(20.2302f, 3.7739f, 20.5079f, 3.842f, 20.6925f, 3.965f)
                lineTo(21.5236f, 2.7162f)
                curveTo(20.8164f, 2.2455f, 20.0213f, 2.2792f, 19.2023f, 2.4879f)
                curveTo(18.3975f, 2.693f, 17.3967f, 3.114f, 16.1661f, 3.6291f)
                lineTo(16.7452f, 5.0128f)
                close()
                moveTo(12.75f, 8.8479f)
                curveTo(12.75f, 8.1863f, 12.751f, 7.7499f, 12.7875f, 7.4142f)
                curveTo(12.822f, 7.0966f, 12.8823f, 6.9401f, 12.9594f, 6.8243f)
                lineTo(11.7106f, 5.9932f)
                curveTo(11.4527f, 6.3809f, 11.3455f, 6.7986f, 11.2963f, 7.2522f)
                curveTo(11.249f, 7.6875f, 11.25f, 8.2189f, 11.25f, 8.8479f)
                horizontalLineTo(12.75f)
                close()
                moveTo(14.1661f, 4.4662f)
                curveTo(13.5859f, 4.709f, 13.0953f, 4.9132f, 12.712f, 5.1249f)
                curveTo(12.3126f, 5.3455f, 11.9686f, 5.6056f, 11.7106f, 5.9932f)
                lineTo(12.9594f, 6.8243f)
                curveTo(13.0364f, 6.7085f, 13.1575f, 6.5924f, 13.4371f, 6.438f)
                curveTo(13.7328f, 6.2747f, 14.135f, 6.1053f, 14.7452f, 5.8499f)
                lineTo(14.1661f, 4.4662f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 11.0f)
                verticalLineTo(2.0f)
                curveTo(7.0f, 4.0711f, 8.7574f, 5.0f, 10.0f, 5.0f)
                moveTo(7.0f, 10.5f)
                curveTo(7.0f, 11.8807f, 5.8807f, 13.0f, 4.5f, 13.0f)
                curveTo(3.1193f, 13.0f, 2.0f, 11.8807f, 2.0f, 10.5f)
                curveTo(2.0f, 9.1193f, 3.1193f, 8.0f, 4.5f, 8.0f)
                curveTo(5.8807f, 8.0f, 7.0f, 9.1193f, 7.0f, 10.5f)
                close()
            }
        }
            .build()
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
