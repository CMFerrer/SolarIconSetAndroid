package com.chiksmedina.solar.outline.businessstatistic

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
import com.chiksmedina.solar.outline.BusinessStatisticGroup

val BusinessStatisticGroup.PieChart3: ImageVector
    get() {
        if (_pieChart3 != null) {
            return _pieChart3!!
        }
        _pieChart3 = Builder(
            name = "PieChart3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5195f, 1.8681f)
                curveTo(10.9156f, 1.4678f, 10.3263f, 1.352f, 9.6772f, 1.456f)
                curveTo(9.1236f, 1.5447f, 8.5242f, 1.7983f, 7.8811f, 2.0704f)
                lineTo(7.8137f, 2.0989f)
                curveTo(7.1922f, 2.3616f, 6.594f, 2.6836f, 6.0276f, 3.062f)
                curveTo(4.2598f, 4.2432f, 2.8819f, 5.9221f, 2.0683f, 7.8864f)
                curveTo(1.2547f, 9.8507f, 1.0418f, 12.0122f, 1.4566f, 14.0975f)
                curveTo(1.8714f, 16.1828f, 2.8952f, 18.0983f, 4.3986f, 19.6017f)
                curveTo(5.902f, 21.1051f, 7.8175f, 22.1289f, 9.9028f, 22.5437f)
                curveTo(11.9881f, 22.9585f, 14.1495f, 22.7456f, 16.1138f, 21.932f)
                curveTo(18.0782f, 21.1183f, 19.7571f, 19.7405f, 20.9383f, 17.9727f)
                curveTo(21.3167f, 17.4063f, 21.6386f, 16.8081f, 21.9014f, 16.1866f)
                lineTo(21.9299f, 16.1192f)
                curveTo(22.202f, 15.4761f, 22.4555f, 14.8767f, 22.5443f, 14.323f)
                curveTo(22.6483f, 13.674f, 22.5325f, 13.0847f, 22.1322f, 12.4808f)
                curveTo(21.7022f, 11.8323f, 21.1171f, 11.5187f, 20.4065f, 11.3767f)
                curveTo(19.7731f, 11.2501f, 18.9813f, 11.2502f, 18.0711f, 11.2503f)
                lineTo(16.0f, 11.2503f)
                curveTo(15.036f, 11.2503f, 14.3884f, 11.2487f, 13.9054f, 11.1837f)
                curveTo(13.4439f, 11.1217f, 13.2464f, 11.0145f, 13.1161f, 10.8842f)
                curveTo(12.9858f, 10.7538f, 12.8786f, 10.5564f, 12.8165f, 10.0949f)
                curveTo(12.7516f, 9.6118f, 12.75f, 8.9643f, 12.75f, 8.0003f)
                lineTo(12.75f, 5.9292f)
                curveTo(12.7501f, 5.019f, 12.7502f, 4.2272f, 12.6236f, 3.5938f)
                curveTo(12.4816f, 2.8832f, 12.168f, 2.298f, 11.5195f, 1.8681f)
                close()
                moveTo(8.3978f, 3.4805f)
                curveTo(9.132f, 3.1701f, 9.5623f, 2.9936f, 9.9146f, 2.9371f)
                curveTo(10.1907f, 2.8929f, 10.3996f, 2.9254f, 10.6907f, 3.1184f)
                curveTo(10.9371f, 3.2817f, 11.0709f, 3.4788f, 11.1527f, 3.8878f)
                curveTo(11.2466f, 4.3575f, 11.25f, 4.9979f, 11.25f, 6.0003f)
                lineTo(11.25f, 8.0523f)
                curveTo(11.25f, 8.9507f, 11.2499f, 9.7f, 11.3299f, 10.2948f)
                curveTo(11.4143f, 10.9226f, 11.6f, 11.4894f, 12.0555f, 11.9448f)
                curveTo(12.5109f, 12.4003f, 13.0777f, 12.586f, 13.7055f, 12.6704f)
                curveTo(14.3003f, 12.7503f, 15.0495f, 12.7503f, 15.948f, 12.7503f)
                lineTo(18.0f, 12.7503f)
                curveTo(19.0024f, 12.7503f, 19.6427f, 12.7537f, 20.1125f, 12.8476f)
                curveTo(20.5215f, 12.9293f, 20.7186f, 13.0632f, 20.8819f, 13.3096f)
                curveTo(21.0748f, 13.6006f, 21.1074f, 13.8095f, 21.0632f, 14.0857f)
                curveTo(21.0067f, 14.438f, 20.8302f, 14.8683f, 20.5198f, 15.6024f)
                curveTo(20.2937f, 16.1372f, 20.0167f, 16.652f, 19.6911f, 17.1393f)
                curveTo(18.6747f, 18.6605f, 17.23f, 19.8461f, 15.5398f, 20.5462f)
                curveTo(13.8496f, 21.2463f, 11.9897f, 21.4295f, 10.1954f, 21.0725f)
                curveTo(8.4011f, 20.7156f, 6.7529f, 19.8347f, 5.4593f, 18.541f)
                curveTo(4.1656f, 17.2474f, 3.2847f, 15.5992f, 2.9277f, 13.8049f)
                curveTo(2.5708f, 12.0105f, 2.754f, 10.1507f, 3.4541f, 8.4605f)
                curveTo(4.1542f, 6.7702f, 5.3398f, 5.3256f, 6.861f, 4.3092f)
                curveTo(7.3483f, 3.9836f, 7.8631f, 3.7066f, 8.3978f, 3.4805f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.6869f, 1.5888f)
                curveTo(14.2858f, 1.4855f, 13.8769f, 1.727f, 13.7737f, 2.1282f)
                curveTo(13.6704f, 2.5293f, 13.9119f, 2.9382f, 14.3131f, 3.0414f)
                curveTo(17.5624f, 3.8778f, 20.1223f, 6.4376f, 20.9586f, 9.687f)
                curveTo(21.0619f, 10.0881f, 21.4708f, 10.3296f, 21.8719f, 10.2264f)
                curveTo(22.273f, 10.1231f, 22.5145f, 9.7143f, 22.4113f, 9.3131f)
                curveTo(21.4387f, 5.5345f, 18.4656f, 2.5613f, 14.6869f, 1.5888f)
                close()
            }
        }
            .build()
        return _pieChart3!!
    }

private var _pieChart3: ImageVector? = null
