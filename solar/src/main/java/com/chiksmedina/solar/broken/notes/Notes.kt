package com.chiksmedina.solar.broken.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NotesGroup

val NotesGroup.Notes: ImageVector
    get() {
        if (_notes != null) {
            return _notes!!
        }
        _notes = Builder(
            name = "Notes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.7769f, 10.0f)
                lineTo(16.6065f, 11.2941f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 12.8975f)
                lineTo(13.8978f, 13.6739f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.3116f, 12.6473f)
                curveTo(19.7074f, 14.9024f, 19.4052f, 16.0299f, 18.7203f, 16.7612f)
                curveTo(18.1795f, 17.3386f, 17.4796f, 17.7427f, 16.7092f, 17.9223f)
                curveTo(16.6129f, 17.9448f, 16.5152f, 17.9621f, 16.415f, 17.9744f)
                curveTo(15.4999f, 18.0873f, 14.3834f, 17.7881f, 12.3508f, 17.2435f)
                curveTo(10.0957f, 16.6392f, 8.9682f, 16.3371f, 8.2369f, 15.6522f)
                curveTo(7.6595f, 15.1114f, 7.2554f, 14.4115f, 7.0757f, 13.641f)
                curveTo(6.8482f, 12.6652f, 7.1503f, 11.5377f, 7.7546f, 9.2826f)
                lineTo(8.2722f, 7.3508f)
                curveTo(8.3591f, 7.0265f, 8.4398f, 6.7255f, 8.5162f, 6.4456f)
                curveTo(8.9713f, 4.7796f, 9.2771f, 3.863f, 9.8635f, 3.2369f)
                curveTo(10.4043f, 2.6595f, 11.1042f, 2.2554f, 11.8747f, 2.0757f)
                curveTo(12.8504f, 1.8482f, 13.978f, 2.1503f, 16.2331f, 2.7546f)
                curveTo(18.4881f, 3.3588f, 19.6157f, 3.6609f, 20.347f, 4.3459f)
                curveTo(20.9244f, 4.8867f, 21.3285f, 5.5866f, 21.5081f, 6.357f)
                curveTo(21.669f, 7.0471f, 21.565f, 7.813f, 21.2766f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.2722f, 16.647f)
                curveTo(3.8765f, 18.9021f, 4.1786f, 20.0296f, 4.8635f, 20.7609f)
                curveTo(5.4043f, 21.3383f, 6.1042f, 21.7424f, 6.8747f, 21.922f)
                curveTo(7.8504f, 22.1495f, 8.978f, 21.8474f, 11.2331f, 21.2432f)
                curveTo(13.4881f, 20.6389f, 14.6157f, 20.3368f, 15.347f, 19.6519f)
                curveTo(15.8399f, 19.1902f, 16.2065f, 18.6126f, 16.415f, 17.9741f)
                moveTo(8.5162f, 6.4453f)
                curveTo(8.1637f, 6.5365f, 7.7774f, 6.64f, 7.3508f, 6.7543f)
                curveTo(5.0957f, 7.3585f, 3.9681f, 7.6606f, 3.2369f, 8.3456f)
                curveTo(2.6595f, 8.8864f, 2.2554f, 9.5863f, 2.0757f, 10.3567f)
                curveTo(1.9148f, 11.0468f, 2.0188f, 11.8129f, 2.3073f, 13.0f)
            }
        }
            .build()
        return _notes!!
    }

private var _notes: ImageVector? = null
