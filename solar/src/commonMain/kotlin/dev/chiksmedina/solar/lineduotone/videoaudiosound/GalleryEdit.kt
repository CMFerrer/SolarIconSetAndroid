package dev.chiksmedina.solar.lineduotone.videoaudiosound

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
import dev.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.GalleryEdit: ImageVector
    get() {
        if (_galleryEdit != null) {
            return _galleryEdit!!
        }
        _galleryEdit = Builder(
            name = "GalleryEdit", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.5001f)
                lineTo(3.7516f, 10.9675f)
                curveTo(4.6629f, 10.1702f, 6.0363f, 10.2159f, 6.8925f, 11.0721f)
                lineTo(11.1822f, 15.3618f)
                curveTo(11.8694f, 16.0491f, 12.9512f, 16.1428f, 13.7464f, 15.5839f)
                lineTo(14.0446f, 15.3744f)
                curveTo(15.1888f, 14.5702f, 16.7369f, 14.6634f, 17.7765f, 15.599f)
                lineTo(21.0f, 18.5001f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.562f, 2.9354f)
                lineTo(18.9791f, 2.5183f)
                curveTo(19.6702f, 1.8272f, 20.7906f, 1.8272f, 21.4817f, 2.5183f)
                curveTo(22.1728f, 3.2094f, 22.1728f, 4.3298f, 21.4817f, 5.0209f)
                lineTo(21.0646f, 5.438f)
                moveTo(18.562f, 2.9354f)
                curveTo(18.562f, 2.9354f, 18.6142f, 3.8217f, 19.3962f, 4.6038f)
                curveTo(20.1783f, 5.3858f, 21.0646f, 5.438f, 21.0646f, 5.438f)
                moveTo(18.562f, 2.9354f)
                lineTo(14.7275f, 6.7699f)
                curveTo(14.4677f, 7.0297f, 14.3379f, 7.1595f, 14.2262f, 7.3027f)
                curveTo(14.0945f, 7.4716f, 13.9815f, 7.6544f, 13.8894f, 7.8478f)
                curveTo(13.8112f, 8.0117f, 13.7532f, 8.1859f, 13.637f, 8.5344f)
                lineTo(13.2651f, 9.65f)
                moveTo(21.0646f, 5.438f)
                lineTo(17.23f, 9.2725f)
                curveTo(16.9703f, 9.5323f, 16.8405f, 9.6621f, 16.6973f, 9.7738f)
                curveTo(16.5284f, 9.9055f, 16.3456f, 10.0185f, 16.1522f, 10.1106f)
                curveTo(15.9883f, 10.1888f, 15.8141f, 10.2468f, 15.4656f, 10.363f)
                lineTo(14.35f, 10.7349f)
                moveTo(14.35f, 10.7349f)
                lineTo(13.6281f, 10.9755f)
                curveTo(13.4567f, 11.0327f, 13.2676f, 10.988f, 13.1398f, 10.8602f)
                curveTo(13.012f, 10.7324f, 12.9673f, 10.5433f, 13.0245f, 10.3719f)
                lineTo(13.2651f, 9.65f)
                moveTo(14.35f, 10.7349f)
                lineTo(13.2651f, 9.65f)
            }
        }
            .build()
        return _galleryEdit!!
    }

private var _galleryEdit: ImageVector? = null
