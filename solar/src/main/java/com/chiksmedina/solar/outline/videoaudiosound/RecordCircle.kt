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

val VideoAudioSoundGroup.RecordCircle: ImageVector
    get() {
        if (_recordCircle != null) {
            return _recordCircle!!
        }
        _recordCircle = Builder(
            name = "RecordCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
                moveTo(12.0f, 8.75f)
                curveTo(10.2051f, 8.75f, 8.75f, 10.2051f, 8.75f, 12.0f)
                curveTo(8.75f, 13.7949f, 10.2051f, 15.25f, 12.0f, 15.25f)
                curveTo(13.7949f, 15.25f, 15.25f, 13.7949f, 15.25f, 12.0f)
                curveTo(15.25f, 10.2051f, 13.7949f, 8.75f, 12.0f, 8.75f)
                close()
                moveTo(7.25f, 12.0f)
                curveTo(7.25f, 9.3766f, 9.3766f, 7.25f, 12.0f, 7.25f)
                curveTo(14.6234f, 7.25f, 16.75f, 9.3766f, 16.75f, 12.0f)
                curveTo(16.75f, 14.6234f, 14.6234f, 16.75f, 12.0f, 16.75f)
                curveTo(9.3766f, 16.75f, 7.25f, 14.6234f, 7.25f, 12.0f)
                close()
            }
        }
            .build()
        return _recordCircle!!
    }

private var _recordCircle: ImageVector? = null
