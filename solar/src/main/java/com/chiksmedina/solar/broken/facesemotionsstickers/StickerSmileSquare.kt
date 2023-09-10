package com.chiksmedina.solar.broken.facesemotionsstickers

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
import com.chiksmedina.solar.broken.FacesEmotionsStickersGroup

val FacesEmotionsStickersGroup.StickerSmileSquare: ImageVector
    get() {
        if (_stickerSmileSquare != null) {
            return _stickerSmileSquare!!
        }
        _stickerSmileSquare = Builder(
            name = "StickerSmileSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 16.0f)
                curveTo(9.8504f, 16.6303f, 10.8846f, 17.0f, 12.0f, 17.0f)
                curveTo(13.1154f, 17.0f, 14.1496f, 16.6303f, 15.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 10.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 10.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
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
        return _stickerSmileSquare!!
    }

private var _stickerSmileSquare: ImageVector? = null
