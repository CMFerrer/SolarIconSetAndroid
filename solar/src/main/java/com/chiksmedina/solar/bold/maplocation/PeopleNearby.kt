package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.PeopleNearby: ImageVector
    get() {
        if (_peopleNearby != null) {
            return _peopleNearby!!
        }
        _peopleNearby = Builder(
            name = "PeopleNearby", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 4.0f)
                curveTo(9.25f, 2.4812f, 10.4812f, 1.25f, 12.0f, 1.25f)
                curveTo(13.5188f, 1.25f, 14.75f, 2.4812f, 14.75f, 4.0f)
                curveTo(14.75f, 5.5188f, 13.5188f, 6.75f, 12.0f, 6.75f)
                curveTo(10.4812f, 6.75f, 9.25f, 5.5188f, 9.25f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.2231f, 11.5741f)
                lineTo(6.0478f, 10.849f)
                curveTo(5.4221f, 10.6404f, 5.0f, 10.0548f, 5.0f, 9.3953f)
                curveTo(5.0f, 8.4197f, 5.8995f, 7.6925f, 6.8534f, 7.8969f)
                lineTo(8.751f, 8.3035f)
                curveTo(8.8565f, 8.3261f, 8.9093f, 8.3374f, 8.9616f, 8.3483f)
                curveTo(10.966f, 8.7629f, 13.034f, 8.7629f, 15.0384f, 8.3483f)
                curveTo(15.0907f, 8.3374f, 15.1435f, 8.3261f, 15.249f, 8.3035f)
                lineTo(17.1465f, 7.8969f)
                curveTo(18.1005f, 7.6925f, 19.0f, 8.4197f, 19.0f, 9.3953f)
                curveTo(19.0f, 10.0548f, 18.5779f, 10.6404f, 17.9522f, 10.849f)
                lineTo(15.7769f, 11.5741f)
                curveTo(15.514f, 11.6617f, 15.3826f, 11.7055f, 15.2837f, 11.7666f)
                curveTo(14.9471f, 11.9743f, 14.7646f, 12.361f, 14.8182f, 12.753f)
                curveTo(14.834f, 12.8681f, 14.8837f, 12.9974f, 14.9832f, 13.256f)
                lineTo(16.23f, 16.4977f)
                curveTo(16.6011f, 17.4626f, 15.8888f, 18.4997f, 14.8549f, 18.4997f)
                curveTo(14.3263f, 18.4997f, 13.8381f, 18.2165f, 13.5758f, 17.7574f)
                lineTo(12.0f, 14.9997f)
                lineTo(10.4242f, 17.7574f)
                curveTo(10.1619f, 18.2165f, 9.6737f, 18.4997f, 9.1451f, 18.4997f)
                curveTo(8.1112f, 18.4997f, 7.3989f, 17.4626f, 7.77f, 16.4977f)
                lineTo(9.0168f, 13.256f)
                curveTo(9.1163f, 12.9974f, 9.166f, 12.8681f, 9.1818f, 12.753f)
                curveTo(9.2354f, 12.361f, 9.0529f, 11.9743f, 8.7163f, 11.7666f)
                curveTo(8.6174f, 11.7055f, 8.486f, 11.6617f, 8.2231f, 11.5741f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.9998f)
                curveTo(17.5228f, 21.9998f, 22.0f, 19.9851f, 22.0f, 17.4998f)
                curveTo(22.0f, 15.778f, 19.8509f, 14.282f, 16.694f, 13.5254f)
                lineTo(17.63f, 15.959f)
                curveTo(18.379f, 17.9065f, 16.9415f, 19.9996f, 14.8549f, 19.9996f)
                curveTo(13.788f, 19.9996f, 12.8028f, 19.4279f, 12.2735f, 18.5015f)
                lineTo(12.0f, 18.0229f)
                lineTo(11.7265f, 18.5015f)
                curveTo(11.1972f, 19.4279f, 10.212f, 19.9996f, 9.1451f, 19.9996f)
                curveTo(7.0585f, 19.9996f, 5.621f, 17.9065f, 6.37f, 15.959f)
                lineTo(7.306f, 13.5254f)
                curveTo(4.1491f, 14.282f, 2.0f, 15.778f, 2.0f, 17.4998f)
                curveTo(2.0f, 19.9851f, 6.4771f, 21.9998f, 12.0f, 21.9998f)
                close()
            }
        }
            .build()
        return _peopleNearby!!
    }

private var _peopleNearby: ImageVector? = null
