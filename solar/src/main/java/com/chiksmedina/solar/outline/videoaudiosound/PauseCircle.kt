package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

public val VideoAudioSoundGroup.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(9.4782f, 7.25f)
                horizontalLineTo(9.5218f)
                curveTo(9.736f, 7.25f, 9.9329f, 7.25f, 10.0982f, 7.2613f)
                curveTo(10.2759f, 7.2734f, 10.4712f, 7.301f, 10.6697f, 7.3832f)
                curveTo(11.0985f, 7.5608f, 11.4392f, 7.9015f, 11.6168f, 8.3303f)
                curveTo(11.699f, 8.5288f, 11.7266f, 8.7241f, 11.7387f, 8.9018f)
                curveTo(11.75f, 9.0671f, 11.75f, 9.264f, 11.75f, 9.4782f)
                verticalLineTo(14.5218f)
                curveTo(11.75f, 14.736f, 11.75f, 14.9329f, 11.7387f, 15.0982f)
                curveTo(11.7266f, 15.2759f, 11.699f, 15.4712f, 11.6168f, 15.6697f)
                curveTo(11.4392f, 16.0985f, 11.0985f, 16.4392f, 10.6697f, 16.6168f)
                curveTo(10.4712f, 16.699f, 10.2759f, 16.7266f, 10.0982f, 16.7387f)
                curveTo(9.9329f, 16.75f, 9.736f, 16.75f, 9.5218f, 16.75f)
                horizontalLineTo(9.4782f)
                curveTo(9.264f, 16.75f, 9.0671f, 16.75f, 8.9018f, 16.7387f)
                curveTo(8.7241f, 16.7266f, 8.5288f, 16.699f, 8.3303f, 16.6168f)
                curveTo(7.9015f, 16.4392f, 7.5608f, 16.0985f, 7.3832f, 15.6697f)
                curveTo(7.301f, 15.4712f, 7.2734f, 15.2759f, 7.2613f, 15.0982f)
                curveTo(7.25f, 14.9329f, 7.25f, 14.736f, 7.25f, 14.5218f)
                verticalLineTo(9.4782f)
                curveTo(7.25f, 9.264f, 7.25f, 9.0671f, 7.2613f, 8.9018f)
                curveTo(7.2734f, 8.7241f, 7.301f, 8.5288f, 7.3832f, 8.3303f)
                curveTo(7.5608f, 7.9015f, 7.9015f, 7.5608f, 8.3303f, 7.3832f)
                curveTo(8.5288f, 7.301f, 8.7241f, 7.2734f, 8.9018f, 7.2613f)
                curveTo(9.0671f, 7.25f, 9.264f, 7.25f, 9.4782f, 7.25f)
                close()
                moveTo(8.9013f, 8.7703f)
                curveTo(8.8425f, 8.7956f, 8.7956f, 8.8425f, 8.7703f, 8.9013f)
                curveTo(8.7684f, 8.9087f, 8.7623f, 8.9371f, 8.7578f, 9.0039f)
                curveTo(8.7504f, 9.1119f, 8.75f, 9.2568f, 8.75f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(8.75f, 14.7432f, 8.7504f, 14.8881f, 8.7578f, 14.9961f)
                curveTo(8.7623f, 15.0629f, 8.7684f, 15.0913f, 8.7703f, 15.0987f)
                curveTo(8.7956f, 15.1575f, 8.8425f, 15.2044f, 8.9013f, 15.2297f)
                curveTo(8.9087f, 15.2316f, 8.9371f, 15.2377f, 9.0039f, 15.2422f)
                curveTo(9.1119f, 15.2496f, 9.2568f, 15.25f, 9.5f, 15.25f)
                curveTo(9.7432f, 15.25f, 9.8881f, 15.2496f, 9.9961f, 15.2422f)
                curveTo(10.0629f, 15.2377f, 10.0913f, 15.2316f, 10.0987f, 15.2297f)
                curveTo(10.1575f, 15.2044f, 10.2044f, 15.1575f, 10.2297f, 15.0987f)
                curveTo(10.2316f, 15.0913f, 10.2377f, 15.0629f, 10.2422f, 14.9961f)
                curveTo(10.2496f, 14.8881f, 10.25f, 14.7432f, 10.25f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(10.25f, 9.2568f, 10.2496f, 9.1119f, 10.2422f, 9.0039f)
                curveTo(10.2377f, 8.9371f, 10.2316f, 8.9087f, 10.2297f, 8.9013f)
                curveTo(10.2044f, 8.8425f, 10.1575f, 8.7956f, 10.0987f, 8.7703f)
                curveTo(10.0913f, 8.7684f, 10.0629f, 8.7623f, 9.9961f, 8.7578f)
                curveTo(9.8881f, 8.7504f, 9.7432f, 8.75f, 9.5f, 8.75f)
                curveTo(9.2568f, 8.75f, 9.1119f, 8.7504f, 9.0039f, 8.7578f)
                curveTo(8.9371f, 8.7623f, 8.9087f, 8.7684f, 8.9013f, 8.7703f)
                close()
                moveTo(14.4782f, 7.25f)
                horizontalLineTo(14.5218f)
                curveTo(14.736f, 7.25f, 14.9329f, 7.25f, 15.0982f, 7.2613f)
                curveTo(15.2759f, 7.2734f, 15.4712f, 7.301f, 15.6697f, 7.3832f)
                curveTo(16.0985f, 7.5608f, 16.4392f, 7.9015f, 16.6168f, 8.3303f)
                curveTo(16.699f, 8.5288f, 16.7266f, 8.7241f, 16.7387f, 8.9018f)
                curveTo(16.75f, 9.0671f, 16.75f, 9.264f, 16.75f, 9.4782f)
                verticalLineTo(14.5218f)
                curveTo(16.75f, 14.736f, 16.75f, 14.9329f, 16.7387f, 15.0982f)
                curveTo(16.7266f, 15.2759f, 16.699f, 15.4712f, 16.6168f, 15.6697f)
                curveTo(16.4392f, 16.0985f, 16.0985f, 16.4392f, 15.6697f, 16.6168f)
                curveTo(15.4712f, 16.699f, 15.2759f, 16.7266f, 15.0982f, 16.7387f)
                curveTo(14.9329f, 16.75f, 14.736f, 16.75f, 14.5218f, 16.75f)
                horizontalLineTo(14.4782f)
                curveTo(14.264f, 16.75f, 14.0671f, 16.75f, 13.9018f, 16.7387f)
                curveTo(13.7241f, 16.7266f, 13.5288f, 16.699f, 13.3303f, 16.6168f)
                curveTo(12.9015f, 16.4392f, 12.5608f, 16.0985f, 12.3832f, 15.6697f)
                curveTo(12.301f, 15.4712f, 12.2734f, 15.2759f, 12.2613f, 15.0982f)
                curveTo(12.25f, 14.9329f, 12.25f, 14.736f, 12.25f, 14.5218f)
                verticalLineTo(9.4782f)
                curveTo(12.25f, 9.264f, 12.25f, 9.0671f, 12.2613f, 8.9018f)
                curveTo(12.2734f, 8.7241f, 12.301f, 8.5288f, 12.3832f, 8.3303f)
                curveTo(12.5608f, 7.9015f, 12.9015f, 7.5608f, 13.3303f, 7.3832f)
                curveTo(13.5288f, 7.301f, 13.7241f, 7.2734f, 13.9018f, 7.2613f)
                curveTo(14.0671f, 7.25f, 14.264f, 7.25f, 14.4782f, 7.25f)
                close()
                moveTo(13.9013f, 8.7703f)
                curveTo(13.8425f, 8.7956f, 13.7956f, 8.8425f, 13.7703f, 8.9013f)
                curveTo(13.7684f, 8.9087f, 13.7623f, 8.9371f, 13.7578f, 9.0039f)
                curveTo(13.7504f, 9.1119f, 13.75f, 9.2568f, 13.75f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(13.75f, 14.7432f, 13.7504f, 14.8881f, 13.7578f, 14.9961f)
                curveTo(13.7623f, 15.0629f, 13.7684f, 15.0913f, 13.7703f, 15.0987f)
                curveTo(13.7956f, 15.1575f, 13.8425f, 15.2044f, 13.9013f, 15.2297f)
                curveTo(13.9087f, 15.2316f, 13.9371f, 15.2377f, 14.0039f, 15.2422f)
                curveTo(14.1119f, 15.2496f, 14.2568f, 15.25f, 14.5f, 15.25f)
                curveTo(14.7432f, 15.25f, 14.8881f, 15.2496f, 14.9961f, 15.2422f)
                curveTo(15.0629f, 15.2377f, 15.0913f, 15.2316f, 15.0987f, 15.2297f)
                curveTo(15.1575f, 15.2044f, 15.2044f, 15.1575f, 15.2297f, 15.0987f)
                curveTo(15.2316f, 15.0913f, 15.2377f, 15.0629f, 15.2422f, 14.9961f)
                curveTo(15.2496f, 14.8881f, 15.25f, 14.7432f, 15.25f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(15.25f, 9.2568f, 15.2496f, 9.1119f, 15.2422f, 9.0039f)
                curveTo(15.2377f, 8.9371f, 15.2316f, 8.9087f, 15.2297f, 8.9013f)
                curveTo(15.2044f, 8.8425f, 15.1575f, 8.7956f, 15.0987f, 8.7703f)
                curveTo(15.0913f, 8.7684f, 15.0629f, 8.7623f, 14.9961f, 8.7578f)
                curveTo(14.8881f, 8.7504f, 14.7432f, 8.75f, 14.5f, 8.75f)
                curveTo(14.2568f, 8.75f, 14.1119f, 8.7504f, 14.0039f, 8.7578f)
                curveTo(13.9371f, 8.7623f, 13.9087f, 8.7684f, 13.9013f, 8.7703f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
