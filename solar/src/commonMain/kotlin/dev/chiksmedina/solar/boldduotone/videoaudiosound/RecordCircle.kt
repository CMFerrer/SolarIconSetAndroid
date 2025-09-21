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
                moveTo(7.25f, 12.0f)
                curveTo(7.25f, 9.3766f, 9.3766f, 7.25f, 12.0f, 7.25f)
                curveTo(14.6234f, 7.25f, 16.75f, 9.3766f, 16.75f, 12.0f)
                curveTo(16.75f, 14.6234f, 14.6234f, 16.75f, 12.0f, 16.75f)
                curveTo(9.3766f, 16.75f, 7.25f, 14.6234f, 7.25f, 12.0f)
                close()
                moveTo(8.75f, 12.0f)
                curveTo(8.75f, 10.2051f, 10.2051f, 8.75f, 12.0f, 8.75f)
                curveTo(13.7949f, 8.75f, 15.25f, 10.2051f, 15.25f, 12.0f)
                curveTo(15.25f, 13.7949f, 13.7949f, 15.25f, 12.0f, 15.25f)
                curveTo(10.2051f, 15.25f, 8.75f, 13.7949f, 8.75f, 12.0f)
                close()
            }
        }
            .build()
        return _recordCircle!!
    }

private var _recordCircle: ImageVector? = null
