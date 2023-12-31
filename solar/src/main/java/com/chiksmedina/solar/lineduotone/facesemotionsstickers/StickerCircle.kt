package com.chiksmedina.solar.lineduotone.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerCircle: ImageVector
    get() {
        if (_stickerCircle != null) {
            return _stickerCircle!!
        }
        _stickerCircle = Builder(
            name = "StickerCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(12.6477f, 22.0f, 13.2503f, 21.7004f, 13.7083f, 21.2424f)
                lineTo(21.2424f, 13.7083f)
                curveTo(21.7004f, 13.2503f, 22.0f, 12.6477f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(12.0f, 19.2071f, 12.0f, 17.8107f, 12.3928f, 16.688f)
                curveTo(13.0964f, 14.6773f, 14.6773f, 13.0964f, 16.688f, 12.3928f)
                curveTo(17.8107f, 12.0f, 19.2071f, 12.0f, 22.0f, 12.0f)
            }
        }
            .build()
        return _stickerCircle!!
    }

private var _stickerCircle: ImageVector? = null
