package com.chiksmedina.solar.broken.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerSquare: ImageVector
    get() {
        if (_stickerSquare != null) {
            return _stickerSquare!!
        }
        _stickerSquare = Builder(
            name = "StickerSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
                moveTo(15.0f, 22.0f)
                curveTo(18.866f, 22.0f, 22.0f, 18.866f, 22.0f, 15.0f)
                moveTo(15.0f, 22.0f)
                curveTo(15.0f, 20.1387f, 15.0f, 19.2081f, 15.2447f, 18.4549f)
                curveTo(15.7393f, 16.9327f, 16.9327f, 15.7393f, 18.4549f, 15.2447f)
                curveTo(19.2081f, 15.0f, 20.1387f, 15.0f, 22.0f, 15.0f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(15.0f)
            }
        }
            .build()
        return _stickerSquare!!
    }

private var _stickerSquare: ImageVector? = null
