package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.ClapperboardEdit: ImageVector
    get() {
        if (_clapperboardEdit != null) {
            return _clapperboardEdit!!
        }
        _clapperboardEdit = Builder(
            name = "ClapperboardEdit", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.9979f, 10.5f)
                curveTo(21.9816f, 6.7682f, 21.8357f, 4.7646f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.7053f, 21.7764f, 6.5869f, 21.9658f, 10.0f, 21.9948f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5f, 8.0f)
                horizontalLineTo(2.5f)
                moveTo(7.0f, 8.0f)
                lineTo(10.5f, 2.5f)
                moveTo(13.5f, 8.0f)
                lineTo(17.0f, 2.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.562f, 13.9354f)
                lineTo(18.9791f, 13.5183f)
                curveTo(19.6702f, 12.8272f, 20.7906f, 12.8272f, 21.4817f, 13.5183f)
                curveTo(22.1728f, 14.2094f, 22.1728f, 15.3298f, 21.4817f, 16.0209f)
                lineTo(21.0646f, 16.438f)
                moveTo(18.562f, 13.9354f)
                curveTo(18.562f, 13.9354f, 18.6142f, 14.8217f, 19.3962f, 15.6038f)
                curveTo(20.1783f, 16.3858f, 21.0646f, 16.438f, 21.0646f, 16.438f)
                moveTo(18.562f, 13.9354f)
                lineTo(14.7275f, 17.77f)
                curveTo(14.4677f, 18.0297f, 14.3379f, 18.1595f, 14.2262f, 18.3027f)
                curveTo(14.0945f, 18.4716f, 13.9815f, 18.6544f, 13.8894f, 18.8478f)
                curveTo(13.8112f, 19.0117f, 13.7532f, 19.1859f, 13.637f, 19.5344f)
                lineTo(13.2651f, 20.65f)
                lineTo(13.1448f, 21.0109f)
                moveTo(21.0646f, 16.438f)
                lineTo(17.23f, 20.2725f)
                curveTo(16.9703f, 20.5323f, 16.8405f, 20.6621f, 16.6973f, 20.7738f)
                curveTo(16.5284f, 20.9055f, 16.3456f, 21.0185f, 16.1522f, 21.1106f)
                curveTo(15.9883f, 21.1888f, 15.8141f, 21.2468f, 15.4656f, 21.363f)
                lineTo(14.35f, 21.7349f)
                lineTo(13.9891f, 21.8552f)
                moveTo(13.9891f, 21.8552f)
                lineTo(13.6281f, 21.9755f)
                curveTo(13.4567f, 22.0327f, 13.2676f, 21.988f, 13.1398f, 21.8602f)
                curveTo(13.012f, 21.7324f, 12.9673f, 21.5433f, 13.0245f, 21.3719f)
                lineTo(13.1448f, 21.0109f)
                moveTo(13.9891f, 21.8552f)
                lineTo(13.1448f, 21.0109f)
            }
        }
            .build()
        return _clapperboardEdit!!
    }

private var _clapperboardEdit: ImageVector? = null
