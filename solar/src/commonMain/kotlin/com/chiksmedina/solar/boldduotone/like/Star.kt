package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4834f, 16.7674f)
                curveTo(17.8471f, 16.9195f, 17.1829f, 17.0f, 16.5f, 17.0f)
                curveTo(11.8056f, 17.0f, 8.0f, 13.1944f, 8.0f, 8.5f)
                curveTo(8.0f, 8.0165f, 8.0404f, 7.5425f, 8.1179f, 7.081f)
                curveTo(8.0817f, 7.1159f, 8.0443f, 7.1479f, 8.0049f, 7.1778f)
                curveTo(7.7243f, 7.3908f, 7.3748f, 7.4699f, 6.6759f, 7.6281f)
                lineTo(6.0395f, 7.772f)
                curveTo(3.5799f, 8.3286f, 2.35f, 8.6068f, 2.0574f, 9.5477f)
                curveTo(1.7648f, 10.4887f, 2.6033f, 11.4691f, 4.2801f, 13.4299f)
                lineTo(4.7139f, 13.9372f)
                curveTo(5.1904f, 14.4944f, 5.4287f, 14.773f, 5.5359f, 15.1177f)
                curveTo(5.6431f, 15.4624f, 5.607f, 15.8341f, 5.535f, 16.5776f)
                lineTo(5.4694f, 17.2544f)
                curveTo(5.2159f, 19.8706f, 5.0891f, 21.1787f, 5.8552f, 21.7602f)
                curveTo(6.6212f, 22.3417f, 7.7727f, 21.8116f, 10.0757f, 20.7512f)
                lineTo(10.6715f, 20.4768f)
                curveTo(11.3259f, 20.1755f, 11.6531f, 20.0249f, 12.0f, 20.0249f)
                curveTo(12.3469f, 20.0249f, 12.6741f, 20.1755f, 13.3285f, 20.4768f)
                lineTo(13.9243f, 20.7512f)
                curveTo(16.2273f, 21.8116f, 17.3788f, 22.3417f, 18.1449f, 21.7602f)
                curveTo(18.9109f, 21.1787f, 18.7841f, 19.8706f, 18.5306f, 17.2544f)
                lineTo(18.4834f, 16.7674f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1533f, 5.4084f)
                lineTo(8.8256f, 5.9962f)
                curveTo(8.4656f, 6.6419f, 8.2857f, 6.9648f, 8.005f, 7.1778f)
                curveTo(8.0444f, 7.1479f, 8.0818f, 7.1159f, 8.118f, 7.081f)
                curveTo(8.0405f, 7.5425f, 8.0001f, 8.0165f, 8.0001f, 8.5f)
                curveTo(8.0001f, 13.1944f, 11.8057f, 17.0f, 16.5001f, 17.0f)
                curveTo(17.183f, 17.0f, 17.8472f, 16.9195f, 18.4835f, 16.7674f)
                lineTo(18.4651f, 16.5776f)
                curveTo(18.3931f, 15.8341f, 18.3571f, 15.4624f, 18.4642f, 15.1177f)
                curveTo(18.5714f, 14.773f, 18.8097f, 14.4944f, 19.2862f, 13.9372f)
                lineTo(19.72f, 13.4299f)
                curveTo(21.3968f, 11.4691f, 22.2353f, 10.4886f, 21.9427f, 9.5477f)
                curveTo(21.6501f, 8.6068f, 20.4202f, 8.3286f, 17.9606f, 7.772f)
                lineTo(17.3242f, 7.628f)
                curveTo(16.6253f, 7.4699f, 16.2758f, 7.3908f, 15.9952f, 7.1778f)
                curveTo(15.7145f, 6.9648f, 15.5346f, 6.6419f, 15.1746f, 5.9962f)
                lineTo(14.8469f, 5.4084f)
                curveTo(13.5803f, 3.1361f, 12.947f, 2.0f, 12.0001f, 2.0f)
                curveTo(11.0532f, 2.0f, 10.4199f, 3.1361f, 9.1533f, 5.4084f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
