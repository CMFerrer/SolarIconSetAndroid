package com.chiksmedina.solar.boldduotone.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.StickerCircle: ImageVector
    get() {
        if (_stickerCircle != null) {
            return _stickerCircle!!
        }
        _stickerCircle = Builder(name = "StickerCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2424f, 13.7083f)
                lineTo(13.7083f, 21.2424f)
                curveTo(13.6419f, 21.3087f, 13.5725f, 21.3718f, 13.5004f, 21.431f)
                curveTo(13.448f, 21.4741f, 13.3943f, 21.5151f, 13.3392f, 21.554f)
                curveTo(12.9462f, 21.8314f, 12.4858f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 21.4484f, 12.0f, 20.9513f, 12.003f, 20.5f)
                curveTo(12.0153f, 18.6662f, 12.0776f, 17.5889f, 12.3928f, 16.688f)
                curveTo(13.0964f, 14.6773f, 14.6773f, 13.0964f, 16.688f, 12.3928f)
                curveTo(17.5889f, 12.0776f, 18.6662f, 12.0153f, 20.5f, 12.003f)
                curveTo(20.9513f, 12.0f, 21.4484f, 12.0f, 22.0f, 12.0f)
                curveTo(22.0f, 12.4858f, 21.8314f, 12.9462f, 21.554f, 13.3392f)
                curveTo(21.5151f, 13.3943f, 21.4741f, 13.448f, 21.431f, 13.5004f)
                curveTo(21.3718f, 13.5725f, 21.3087f, 13.6419f, 21.2424f, 13.7083f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(21.4484f, 12.0f, 20.9513f, 12.0f, 20.5f, 12.003f)
                curveTo(18.6662f, 12.0153f, 17.5889f, 12.0776f, 16.688f, 12.3928f)
                curveTo(14.6773f, 13.0964f, 13.0964f, 14.6773f, 12.3928f, 16.688f)
                curveTo(12.0776f, 17.5889f, 12.0153f, 18.6662f, 12.003f, 20.5f)
                curveTo(12.0f, 20.9513f, 12.0f, 21.4484f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _stickerCircle!!
    }

private var _stickerCircle: ImageVector? = null
