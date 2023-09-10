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

val VideoAudioSoundGroup.MusicNoteSlider: ImageVector
    get() {
        if (_musicNoteSlider != null) {
            return _musicNoteSlider!!
        }
        _musicNoteSlider = Builder(
            name = "MusicNoteSlider", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.7241f, 3.7617f)
                horizontalLineTo(5.2678f)
                curveTo(5.1129f, 3.7671f, 4.9687f, 3.7751f, 4.8344f, 3.7869f)
                curveTo(4.4034f, 3.8248f, 4.0142f, 3.9055f, 3.6507f, 4.1046f)
                curveTo(3.0819f, 4.4162f, 2.6194f, 4.9134f, 2.3295f, 5.5249f)
                curveTo(2.1443f, 5.9156f, 2.0692f, 6.334f, 2.034f, 6.7973f)
                curveTo(2.0f, 7.2449f, 2.0f, 7.7956f, 2.0f, 8.469f)
                verticalLineTo(15.5318f)
                curveTo(2.0f, 16.2052f, 2.0f, 16.7559f, 2.034f, 17.2034f)
                curveTo(2.0692f, 17.6667f, 2.1443f, 18.0851f, 2.3295f, 18.4758f)
                curveTo(2.6194f, 19.0874f, 3.0819f, 19.5845f, 3.6507f, 19.8961f)
                curveTo(4.0142f, 20.0952f, 4.4034f, 20.176f, 4.8344f, 20.2138f)
                curveTo(4.9687f, 20.2256f, 5.1129f, 20.2336f, 5.2678f, 20.239f)
                horizontalLineTo(6.7244f)
                curveTo(6.419f, 19.3408f, 6.419f, 18.0372f, 6.419f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(6.419f, 5.9633f, 6.419f, 4.6599f, 6.7241f, 3.7617f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.2763f, 20.239f)
                curveTo(17.5817f, 19.3408f, 17.5817f, 18.0372f, 17.5817f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(17.5817f, 5.9633f, 17.5817f, 4.6599f, 17.2766f, 3.7617f)
                horizontalLineTo(18.7322f)
                curveTo(18.887f, 3.7671f, 19.0313f, 3.7751f, 19.1656f, 3.7869f)
                curveTo(19.5966f, 3.8248f, 19.9858f, 3.9055f, 20.3493f, 4.1046f)
                curveTo(20.9181f, 4.4162f, 21.3806f, 4.9134f, 21.6705f, 5.5249f)
                curveTo(21.8557f, 5.9156f, 21.9308f, 6.334f, 21.966f, 6.7973f)
                curveTo(22.0f, 7.2448f, 22.0f, 7.7955f, 22.0f, 8.4689f)
                verticalLineTo(15.5318f)
                curveTo(22.0f, 16.2051f, 22.0f, 16.7559f, 21.966f, 17.2034f)
                curveTo(21.9308f, 17.6667f, 21.8557f, 18.0851f, 21.6705f, 18.4758f)
                curveTo(21.3806f, 19.0874f, 20.9181f, 19.5845f, 20.3493f, 19.8961f)
                curveTo(19.9858f, 20.0952f, 19.5966f, 20.176f, 19.1656f, 20.2138f)
                curveTo(19.0313f, 20.2256f, 18.887f, 20.2336f, 18.7322f, 20.239f)
                horizontalLineTo(17.2763f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0001f, 12.75f)
                curveTo(11.6905f, 12.75f, 12.2501f, 13.3096f, 12.2501f, 14.0f)
                curveTo(12.2501f, 14.6904f, 11.6905f, 15.25f, 11.0001f, 15.25f)
                curveTo(10.3097f, 15.25f, 9.7501f, 14.6904f, 9.7501f, 14.0f)
                curveTo(9.7501f, 13.3096f, 10.3097f, 12.75f, 11.0001f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.4187f, 8.0f)
                curveTo(6.4187f, 5.1716f, 6.4187f, 3.7574f, 7.2361f, 2.8787f)
                curveTo(8.0534f, 2.0f, 9.369f, 2.0f, 12.0001f, 2.0f)
                curveTo(14.6312f, 2.0f, 15.9467f, 2.0f, 16.7641f, 2.8787f)
                curveTo(17.5815f, 3.7574f, 17.5815f, 5.1716f, 17.5815f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(17.5815f, 18.8284f, 17.5815f, 20.2426f, 16.7641f, 21.1213f)
                curveTo(15.9467f, 22.0f, 14.6312f, 22.0f, 12.0001f, 22.0f)
                curveTo(9.369f, 22.0f, 8.0534f, 22.0f, 7.2361f, 21.1213f)
                curveTo(6.4187f, 20.2426f, 6.4187f, 18.8284f, 6.4187f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(13.7501f, 8.0f)
                curveTo(13.7501f, 7.5858f, 13.4143f, 7.25f, 13.0001f, 7.25f)
                curveTo(12.5859f, 7.25f, 12.2501f, 7.5858f, 12.2501f, 8.0f)
                verticalLineTo(11.5499f)
                curveTo(11.8751f, 11.3581f, 11.4502f, 11.25f, 11.0001f, 11.25f)
                curveTo(9.4813f, 11.25f, 8.2501f, 12.4812f, 8.2501f, 14.0f)
                curveTo(8.2501f, 15.5188f, 9.4813f, 16.75f, 11.0001f, 16.75f)
                curveTo(12.5189f, 16.75f, 13.7501f, 15.5188f, 13.7501f, 14.0f)
                verticalLineTo(10.4501f)
                curveTo(14.1251f, 10.6419f, 14.55f, 10.75f, 15.0001f, 10.75f)
                curveTo(15.4143f, 10.75f, 15.7501f, 10.4142f, 15.7501f, 10.0f)
                curveTo(15.7501f, 9.5858f, 15.4143f, 9.25f, 15.0001f, 9.25f)
                curveTo(14.3097f, 9.25f, 13.7501f, 8.6904f, 13.7501f, 8.0f)
                close()
            }
        }
            .build()
        return _musicNoteSlider!!
    }

private var _musicNoteSlider: ImageVector? = null
