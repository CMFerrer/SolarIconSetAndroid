package com.chiksmedina.solar.linear.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.StickerSmileCircle: ImageVector
    get() {
        if (_stickerSmileCircle != null) {
            return _stickerSmileCircle!!
        }
        _stickerSmileCircle = Builder(name = "StickerSmileCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(12.6477f, 22.0f, 13.2503f, 21.7004f, 13.7083f, 21.2424f)
                lineTo(21.2424f, 13.7083f)
                curveTo(21.7004f, 13.2503f, 22.0f, 12.6477f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9126f, 15.9331f)
                curveTo(9.9467f, 16.1923f, 11.0951f, 16.2386f, 12.2688f, 16.0333f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5435f, 10.0334f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7481f, 11.5866f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, 1.9319f, -0.5176f)
                arcToRelative(1.5f, 1.0f, 75.0f, true, false, -1.9319f, 0.5176f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(12.0f, 19.2071f, 12.0f, 17.8107f, 12.3928f, 16.688f)
                curveTo(13.0964f, 14.6773f, 14.6773f, 13.0964f, 16.688f, 12.3928f)
                curveTo(17.8107f, 12.0f, 19.2071f, 12.0f, 22.0f, 12.0f)
            }
        }
        .build()
        return _stickerSmileCircle!!
    }

private var _stickerSmileCircle: ImageVector? = null
