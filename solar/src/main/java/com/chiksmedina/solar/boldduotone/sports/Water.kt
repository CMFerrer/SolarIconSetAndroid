package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(
            name = "Water", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.5814f, 6.0104f)
                curveTo(5.2722f, 4.9947f, 6.715f, 5.0326f, 7.4433f, 5.9094f)
                curveTo(8.4253f, 7.0915f, 9.8097f, 8.2498f, 11.9999f, 8.2498f)
                curveTo(14.2277f, 8.2498f, 15.5908f, 7.32f, 16.5185f, 6.1537f)
                curveTo(17.2399f, 5.2467f, 18.7773f, 5.101f, 19.5335f, 6.1769f)
                curveTo(20.1519f, 7.0569f, 20.8279f, 7.7578f, 22.1622f, 8.0535f)
                curveTo(22.5666f, 8.1432f, 22.8218f, 8.5436f, 22.7322f, 8.948f)
                curveTo(22.6425f, 9.3524f, 22.242f, 9.6076f, 21.8376f, 9.518f)
                curveTo(19.9966f, 9.11f, 19.039f, 8.0821f, 18.3062f, 7.0394f)
                curveTo(18.2576f, 6.9702f, 18.1707f, 6.9192f, 18.0397f, 6.9215f)
                curveTo(17.9037f, 6.9239f, 17.7729f, 6.9862f, 17.6924f, 7.0875f)
                curveTo(16.5171f, 8.5651f, 14.741f, 9.7498f, 11.9999f, 9.7498f)
                curveTo(9.177f, 9.7498f, 7.4106f, 8.2175f, 6.2895f, 6.8678f)
                curveTo(6.2242f, 6.7893f, 6.1273f, 6.7479f, 6.0286f, 6.7499f)
                curveTo(5.9332f, 6.7518f, 5.8639f, 6.792f, 5.8218f, 6.8539f)
                curveTo(5.0756f, 7.9511f, 4.1183f, 9.0845f, 2.1622f, 9.518f)
                curveTo(1.7578f, 9.6076f, 1.3573f, 9.3524f, 1.2677f, 8.948f)
                curveTo(1.1781f, 8.5436f, 1.4332f, 8.1432f, 1.8376f, 8.0535f)
                curveTo(3.2496f, 7.7406f, 3.9258f, 6.9743f, 4.5814f, 6.0104f)
                close()
                moveTo(4.5814f, 16.0104f)
                curveTo(5.2722f, 14.9947f, 6.715f, 15.0326f, 7.4433f, 15.9094f)
                curveTo(8.4253f, 17.0915f, 9.8097f, 18.2498f, 11.9999f, 18.2498f)
                curveTo(14.2277f, 18.2498f, 15.5908f, 17.3199f, 16.5185f, 16.1537f)
                curveTo(17.2399f, 15.2467f, 18.7773f, 15.101f, 19.5335f, 16.1769f)
                curveTo(20.1519f, 17.0569f, 20.8279f, 17.7578f, 22.1622f, 18.0535f)
                curveTo(22.5666f, 18.1431f, 22.8218f, 18.5436f, 22.7322f, 18.948f)
                curveTo(22.6425f, 19.3524f, 22.242f, 19.6076f, 21.8376f, 19.518f)
                curveTo(19.9966f, 19.11f, 19.039f, 18.0821f, 18.3062f, 17.0394f)
                curveTo(18.2576f, 16.9702f, 18.1707f, 16.9192f, 18.0397f, 16.9215f)
                curveTo(17.9037f, 16.9239f, 17.7729f, 16.9862f, 17.6924f, 17.0875f)
                curveTo(16.5171f, 18.5651f, 14.741f, 19.7498f, 11.9999f, 19.7498f)
                curveTo(9.177f, 19.7498f, 7.4106f, 18.2175f, 6.2895f, 16.8678f)
                curveTo(6.2242f, 16.7893f, 6.1273f, 16.7479f, 6.0286f, 16.7499f)
                curveTo(5.9332f, 16.7518f, 5.8639f, 16.792f, 5.8218f, 16.8539f)
                curveTo(5.0756f, 17.9511f, 4.1183f, 19.0845f, 2.1622f, 19.518f)
                curveTo(1.7578f, 19.6076f, 1.3573f, 19.3524f, 1.2677f, 18.948f)
                curveTo(1.1781f, 18.5436f, 1.4332f, 18.1431f, 1.8376f, 18.0535f)
                curveTo(3.2496f, 17.7406f, 3.9258f, 16.9744f, 4.5814f, 16.0104f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5817f, 11.0104f)
                curveTo(5.2724f, 9.9947f, 6.7153f, 10.0326f, 7.4436f, 10.9094f)
                curveTo(8.4256f, 12.0915f, 9.8099f, 13.2498f, 12.0002f, 13.2498f)
                curveTo(14.2279f, 13.2498f, 15.5911f, 12.3199f, 16.5187f, 11.1537f)
                curveTo(17.2401f, 10.2467f, 18.7776f, 10.101f, 19.5337f, 11.1769f)
                curveTo(20.1521f, 12.0569f, 20.8281f, 12.7578f, 22.1624f, 13.0535f)
                curveTo(22.5668f, 13.1431f, 22.822f, 13.5436f, 22.7324f, 13.948f)
                curveTo(22.6428f, 14.3524f, 22.2423f, 14.6076f, 21.8379f, 14.518f)
                curveTo(19.9969f, 14.11f, 19.0392f, 13.0821f, 18.3064f, 12.0394f)
                curveTo(18.2578f, 11.9702f, 18.171f, 11.9192f, 18.04f, 11.9215f)
                curveTo(17.904f, 11.9239f, 17.7732f, 11.9862f, 17.6927f, 12.0875f)
                curveTo(16.5174f, 13.5651f, 14.7413f, 14.7498f, 12.0002f, 14.7498f)
                curveTo(9.1773f, 14.7498f, 7.4109f, 13.2175f, 6.2897f, 11.8678f)
                curveTo(6.2245f, 11.7893f, 6.1275f, 11.7479f, 6.0289f, 11.7499f)
                curveTo(5.9335f, 11.7518f, 5.8641f, 11.792f, 5.822f, 11.8539f)
                curveTo(5.0758f, 12.9511f, 4.1186f, 14.0845f, 2.1624f, 14.518f)
                curveTo(1.758f, 14.6076f, 1.3575f, 14.3524f, 1.2679f, 13.948f)
                curveTo(1.1783f, 13.5436f, 1.4335f, 13.1431f, 1.8379f, 13.0535f)
                curveTo(3.2498f, 12.7406f, 3.9261f, 11.9744f, 4.5817f, 11.0104f)
                close()
            }
        }
            .build()
        return _water!!
    }

private var _water: ImageVector? = null
