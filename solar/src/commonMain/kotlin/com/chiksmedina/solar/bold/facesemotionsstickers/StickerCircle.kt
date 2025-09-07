package com.chiksmedina.solar.bold.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FacesEmotionsStickersGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.013f, 2.0f, 21.1645f, 5.6887f, 21.8882f, 10.5f)
                lineTo(21.686f, 10.4999f)
                curveTo(19.1965f, 10.4991f, 17.5598f, 10.4986f, 16.1926f, 10.977f)
                curveTo(13.751f, 11.8313f, 11.8313f, 13.751f, 10.977f, 16.1926f)
                curveTo(10.4986f, 17.5598f, 10.4991f, 19.1965f, 10.4999f, 21.686f)
                lineTo(10.5f, 21.8882f)
                curveTo(5.6887f, 21.1645f, 2.0f, 17.013f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
        }
            .build()
        return _stickerCircle!!
    }

private var _stickerCircle: ImageVector? = null
