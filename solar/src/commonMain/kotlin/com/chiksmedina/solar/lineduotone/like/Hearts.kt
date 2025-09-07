package com.chiksmedina.solar.lineduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.LikeGroup

val LikeGroup.Hearts: ImageVector
    get() {
        if (_hearts != null) {
            return _hearts!!
        }
        _hearts = Builder(
            name = "Hearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.829f, 20.1692f)
                lineTo(15.2787f, 19.569f)
                lineTo(15.2787f, 19.569f)
                lineTo(14.829f, 20.1692f)
                close()
                moveTo(16.5f, 13.1584f)
                lineTo(15.973f, 13.692f)
                curveTo(16.2651f, 13.9805f, 16.7349f, 13.9805f, 17.027f, 13.692f)
                lineTo(16.5f, 13.1584f)
                close()
                moveTo(18.171f, 20.1692f)
                lineTo(17.7213f, 19.569f)
                lineTo(17.7213f, 19.569f)
                lineTo(18.171f, 20.1692f)
                close()
                moveTo(21.1474f, 12.9177f)
                lineTo(21.6899f, 12.3998f)
                lineTo(21.6899f, 12.3998f)
                lineTo(21.1474f, 12.9177f)
                close()
                moveTo(14.4018f, 19.8538f)
                lineTo(13.9586f, 20.4589f)
                lineTo(13.9586f, 20.4589f)
                lineTo(14.4018f, 19.8538f)
                close()
                moveTo(11.75f, 15.0595f)
                curveTo(11.75f, 14.0904f, 12.3259f, 13.2722f, 13.1208f, 12.9269f)
                curveTo(13.8774f, 12.5981f, 14.9309f, 12.6628f, 15.973f, 13.692f)
                lineTo(17.027f, 12.6247f)
                curveTo(15.5942f, 11.2098f, 13.8977f, 10.9538f, 12.523f, 11.5511f)
                curveTo(11.1866f, 12.1318f, 10.25f, 13.4863f, 10.25f, 15.0595f)
                horizontalLineTo(11.75f)
                close()
                moveTo(14.3792f, 20.7694f)
                curveTo(14.658f, 20.9783f, 14.9785f, 21.2176f, 15.3082f, 21.4007f)
                curveTo(15.6385f, 21.5842f, 16.044f, 21.75f, 16.5f, 21.75f)
                verticalLineTo(20.25f)
                curveTo(16.406f, 20.25f, 16.2615f, 20.2144f, 16.0365f, 20.0894f)
                curveTo(15.811f, 19.9641f, 15.5709f, 19.788f, 15.2787f, 19.569f)
                lineTo(14.3792f, 20.7694f)
                close()
                moveTo(18.6208f, 20.7694f)
                curveTo(19.3846f, 20.1971f, 20.4262f, 19.4965f, 21.2404f, 18.625f)
                curveTo(22.0803f, 17.726f, 22.75f, 16.5776f, 22.75f, 15.0595f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 16.0838f, 20.8143f, 16.8839f, 20.1443f, 17.601f)
                curveTo(19.4486f, 18.3456f, 18.5758f, 18.9287f, 17.7213f, 19.569f)
                lineTo(18.6208f, 20.7694f)
                close()
                moveTo(17.7213f, 19.569f)
                curveTo(17.4291f, 19.788f, 17.189f, 19.9641f, 16.9635f, 20.0894f)
                curveTo(16.7385f, 20.2144f, 16.594f, 20.25f, 16.5f, 20.25f)
                verticalLineTo(21.75f)
                curveTo(16.956f, 21.75f, 17.3615f, 21.5842f, 17.6918f, 21.4007f)
                curveTo(18.0215f, 21.2176f, 18.342f, 20.9783f, 18.6208f, 20.7694f)
                lineTo(17.7213f, 19.569f)
                close()
                moveTo(22.75f, 15.0595f)
                curveTo(22.75f, 14.0256f, 22.3452f, 13.0863f, 21.6899f, 12.3998f)
                lineTo(20.6048f, 13.4355f)
                curveTo(21.0019f, 13.8515f, 21.25f, 14.423f, 21.25f, 15.0595f)
                horizontalLineTo(22.75f)
                close()
                moveTo(21.6899f, 12.3998f)
                curveTo(21.0204f, 11.6985f, 20.0832f, 11.2553f, 19.0473f, 11.25f)
                curveTo(18.0033f, 11.2448f, 16.9258f, 11.6838f, 15.973f, 12.6247f)
                lineTo(17.027f, 13.692f)
                curveTo(17.7361f, 12.9917f, 18.4445f, 12.747f, 19.0398f, 12.75f)
                curveTo(19.6433f, 12.7531f, 20.1988f, 13.0102f, 20.6048f, 13.4355f)
                lineTo(21.6899f, 12.3998f)
                close()
                moveTo(15.2787f, 19.569f)
                curveTo(15.1364f, 19.4624f, 14.9905f, 19.3553f, 14.845f, 19.2488f)
                lineTo(13.9586f, 20.4589f)
                curveTo(14.1043f, 20.5655f, 14.2442f, 20.6683f, 14.3792f, 20.7694f)
                lineTo(15.2787f, 19.569f)
                close()
                moveTo(14.845f, 19.2488f)
                curveTo(13.2191f, 18.0578f, 11.75f, 16.9423f, 11.75f, 15.0595f)
                horizontalLineTo(10.25f)
                curveTo(10.25f, 17.8258f, 12.4773f, 19.3738f, 13.9586f, 20.4589f)
                lineTo(14.845f, 19.2488f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9617f, 19.3384f)
                lineTo(9.4388f, 18.7597f)
                lineTo(9.4388f, 18.7597f)
                lineTo(8.9617f, 19.3384f)
                close()
                moveTo(12.0f, 5.3168f)
                lineTo(11.4482f, 5.8247f)
                curveTo(11.5902f, 5.979f, 11.7903f, 6.0668f, 12.0f, 6.0668f)
                curveTo(12.2097f, 6.0668f, 12.4098f, 5.979f, 12.5518f, 5.8247f)
                lineTo(12.0f, 5.3168f)
                close()
                moveTo(9.4388f, 18.7597f)
                curveTo(6.3848f, 16.2424f, 2.75f, 13.7727f, 2.75f, 9.119f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 14.6347f, 5.6541f, 17.584f, 8.4847f, 19.9172f)
                lineTo(9.4388f, 18.7597f)
                close()
                moveTo(2.75f, 9.119f)
                curveTo(2.75f, 6.839f, 3.9823f, 4.9451f, 5.636f, 4.1547f)
                curveTo(7.2323f, 3.3917f, 9.3864f, 3.5849f, 11.4482f, 5.8247f)
                lineTo(12.5518f, 4.8088f)
                curveTo(10.1138f, 2.1603f, 7.2679f, 1.7122f, 4.9891f, 2.8013f)
                curveTo(2.7678f, 3.863f, 1.25f, 6.3144f, 1.25f, 9.119f)
                horizontalLineTo(2.75f)
                close()
                moveTo(8.4847f, 19.9172f)
                curveTo(8.9968f, 20.3392f, 9.5466f, 20.7895f, 10.1042f, 21.1301f)
                curveTo(10.6606f, 21.4701f, 11.301f, 21.75f, 12.0f, 21.75f)
                verticalLineTo(20.25f)
                curveTo(11.699f, 20.25f, 11.3394f, 20.127f, 10.8862f, 19.8501f)
                curveTo(10.4342f, 19.574f, 9.965f, 19.1934f, 9.4388f, 18.7597f)
                lineTo(8.4847f, 19.9172f)
                close()
                moveTo(22.75f, 9.119f)
                curveTo(22.75f, 6.3144f, 21.2322f, 3.863f, 19.0109f, 2.8013f)
                curveTo(16.7321f, 1.7122f, 13.8862f, 2.1603f, 11.4482f, 4.8088f)
                lineTo(12.5518f, 5.8247f)
                curveTo(14.6136f, 3.5849f, 16.7677f, 3.3917f, 18.364f, 4.1547f)
                curveTo(20.0177f, 4.9451f, 21.25f, 6.839f, 21.25f, 9.119f)
                horizontalLineTo(22.75f)
                close()
                moveTo(21.8239f, 13.2414f)
                curveTo(22.3995f, 12.0384f, 22.75f, 10.6779f, 22.75f, 9.119f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 10.4425f, 20.9547f, 11.5826f, 20.4708f, 12.594f)
                lineTo(21.8239f, 13.2414f)
                close()
                moveTo(13.939f, 19.2637f)
                curveTo(13.1119f, 19.9123f, 12.5056f, 20.25f, 12.0f, 20.25f)
                verticalLineTo(21.75f)
                curveTo(13.0828f, 21.75f, 14.065f, 21.0712f, 14.8647f, 20.444f)
                lineTo(13.939f, 19.2637f)
                close()
            }
        }
            .build()
        return _hearts!!
    }

private var _hearts: ImageVector? = null
