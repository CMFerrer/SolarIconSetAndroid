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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.5116f, 3.6984f)
                curveTo(8.9663f, 4.0739f, 9.5456f, 4.25f, 10.0f, 4.25f)
                curveTo(10.4142f, 4.25f, 10.75f, 4.5858f, 10.75f, 5.0f)
                curveTo(10.75f, 5.4142f, 10.4142f, 5.75f, 10.0f, 5.75f)
                curveTo(9.2795f, 5.75f, 8.4485f, 5.5091f, 7.75f, 5.0045f)
                verticalLineTo(11.0f)
                curveTo(7.75f, 11.1595f, 7.7002f, 11.3074f, 7.6153f, 11.429f)
                curveTo(7.2156f, 12.7712f, 5.9721f, 13.75f, 4.5f, 13.75f)
                curveTo(2.7051f, 13.75f, 1.25f, 12.2949f, 1.25f, 10.5f)
                curveTo(1.25f, 8.7051f, 2.7051f, 7.25f, 4.5f, 7.25f)
                curveTo(5.1443f, 7.25f, 5.7449f, 7.4375f, 6.25f, 7.7609f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.75f)
                curveTo(7.75f, 2.7978f, 8.0784f, 3.3406f, 8.5116f, 3.6984f)
                close()
                moveTo(6.25f, 10.5f)
                curveTo(6.25f, 9.5335f, 5.4665f, 8.75f, 4.5f, 8.75f)
                curveTo(3.5335f, 8.75f, 2.75f, 9.5335f, 2.75f, 10.5f)
                curveTo(2.75f, 11.4665f, 3.5335f, 12.25f, 4.5f, 12.25f)
                curveTo(5.4665f, 12.25f, 6.25f, 11.4665f, 6.25f, 10.5f)
                close()
                moveTo(19.5727f, 3.9411f)
                curveTo(18.901f, 4.1123f, 18.0215f, 4.4782f, 16.7452f, 5.0124f)
                lineTo(14.7452f, 5.8495f)
                curveTo(14.135f, 6.1049f, 13.7328f, 6.2744f, 13.4371f, 6.4376f)
                curveTo(13.1575f, 6.5921f, 13.0364f, 6.7082f, 12.9594f, 6.8239f)
                curveTo(12.8823f, 6.9397f, 12.822f, 7.0963f, 12.7875f, 7.4138f)
                curveTo(12.751f, 7.7495f, 12.75f, 8.186f, 12.75f, 8.8475f)
                verticalLineTo(10.8922f)
                lineTo(21.2497f, 7.4924f)
                curveTo(21.2478f, 6.3837f, 21.2348f, 5.5851f, 21.1466f, 4.9885f)
                curveTo(21.0473f, 4.3173f, 20.8772f, 4.0875f, 20.6925f, 3.9646f)
                curveTo(20.5079f, 3.8417f, 20.2302f, 3.7735f, 19.5727f, 3.9411f)
                close()
                moveTo(22.75f, 7.9825f)
                verticalLineTo(7.9476f)
                curveTo(22.75f, 6.6422f, 22.7501f, 5.5776f, 22.6304f, 4.769f)
                curveTo(22.5067f, 3.9329f, 22.2308f, 3.1865f, 21.5236f, 2.7159f)
                curveTo(20.8164f, 2.2452f, 20.0213f, 2.2788f, 19.2023f, 2.4875f)
                curveTo(18.4102f, 2.6894f, 17.4282f, 3.1004f, 16.224f, 3.6045f)
                lineTo(14.13f, 4.4809f)
                curveTo(13.5655f, 4.7172f, 13.0873f, 4.9173f, 12.712f, 5.1246f)
                curveTo(12.3126f, 5.3451f, 11.9686f, 5.6052f, 11.7106f, 5.9929f)
                curveTo(11.4527f, 6.3805f, 11.3455f, 6.7983f, 11.2963f, 7.2518f)
                curveTo(11.25f, 7.6781f, 11.25f, 8.1965f, 11.25f, 8.8084f)
                verticalLineTo(11.983f)
                curveTo(11.2497f, 11.9945f, 11.2497f, 12.006f, 11.25f, 12.0175f)
                verticalLineTo(16.7609f)
                curveTo(10.7449f, 16.4375f, 10.1443f, 16.25f, 9.5f, 16.25f)
                curveTo(7.7051f, 16.25f, 6.25f, 17.7051f, 6.25f, 19.5f)
                curveTo(6.25f, 21.2949f, 7.7051f, 22.75f, 9.5f, 22.75f)
                curveTo(11.2949f, 22.75f, 12.75f, 21.2949f, 12.75f, 19.5f)
                curveTo(12.75f, 19.33f, 12.7369f, 19.163f, 12.7118f, 19.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.5078f)
                lineTo(21.25f, 9.1078f)
                verticalLineTo(14.7609f)
                curveTo(20.7449f, 14.4375f, 20.1443f, 14.25f, 19.5f, 14.25f)
                curveTo(17.7051f, 14.25f, 16.25f, 15.7051f, 16.25f, 17.5f)
                curveTo(16.25f, 19.2949f, 17.7051f, 20.75f, 19.5f, 20.75f)
                curveTo(21.2949f, 20.75f, 22.75f, 19.2949f, 22.75f, 17.5f)
                curveTo(22.75f, 17.3831f, 22.7438f, 17.2676f, 22.7318f, 17.1538f)
                horizontalLineTo(22.75f)
                verticalLineTo(8.017f)
                curveTo(22.7503f, 8.0055f, 22.7503f, 7.994f, 22.75f, 7.9825f)
                close()
                moveTo(19.5f, 15.75f)
                curveTo(18.5335f, 15.75f, 17.75f, 16.5335f, 17.75f, 17.5f)
                curveTo(17.75f, 18.4665f, 18.5335f, 19.25f, 19.5f, 19.25f)
                curveTo(20.4665f, 19.25f, 21.25f, 18.4665f, 21.25f, 17.5f)
                curveTo(21.25f, 16.5335f, 20.4665f, 15.75f, 19.5f, 15.75f)
                close()
                moveTo(9.5f, 17.75f)
                curveTo(8.5335f, 17.75f, 7.75f, 18.5335f, 7.75f, 19.5f)
                curveTo(7.75f, 20.4665f, 8.5335f, 21.25f, 9.5f, 21.25f)
                curveTo(10.4665f, 21.25f, 11.25f, 20.4665f, 11.25f, 19.5f)
                curveTo(11.25f, 18.5335f, 10.4665f, 17.75f, 9.5f, 17.75f)
                close()
            }
        }
            .build()
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
