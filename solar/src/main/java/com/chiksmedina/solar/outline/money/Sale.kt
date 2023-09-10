package com.chiksmedina.solar.outline.money

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
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Sale: ImageVector
    get() {
        if (_sale != null) {
            return _sale!!
        }
        _sale = Builder(
            name = "Sale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5936f, 2.3188f)
                curveTo(11.483f, 1.8937f, 12.517f, 1.8937f, 13.4064f, 2.3188f)
                curveTo(13.7928f, 2.5035f, 14.1468f, 2.8055f, 14.6371f, 3.2237f)
                curveTo(14.6625f, 3.2454f, 14.6884f, 3.2674f, 14.7146f, 3.2897f)
                curveTo(14.9526f, 3.4926f, 15.0276f, 3.555f, 15.1035f, 3.6058f)
                curveTo(15.2965f, 3.7352f, 15.5132f, 3.8249f, 15.7411f, 3.87f)
                curveTo(15.8307f, 3.8876f, 15.9278f, 3.8965f, 16.2396f, 3.9214f)
                curveTo(16.2739f, 3.9242f, 16.3078f, 3.9269f, 16.3411f, 3.9295f)
                curveTo(16.9834f, 3.9805f, 17.4473f, 4.0173f, 17.8511f, 4.1599f)
                curveTo(18.7807f, 4.4882f, 19.5118f, 5.2193f, 19.8401f, 6.1488f)
                curveTo(19.9827f, 6.5527f, 20.0195f, 7.0166f, 20.0705f, 7.6589f)
                curveTo(20.0732f, 7.6922f, 20.0758f, 7.7261f, 20.0786f, 7.7604f)
                curveTo(20.1035f, 8.0722f, 20.1124f, 8.1693f, 20.1301f, 8.2589f)
                curveTo(20.175f, 8.4868f, 20.2648f, 8.7036f, 20.3941f, 8.8965f)
                curveTo(20.445f, 8.9724f, 20.5074f, 9.0474f, 20.7103f, 9.2854f)
                curveTo(20.7326f, 9.3117f, 20.7546f, 9.3375f, 20.7763f, 9.3629f)
                curveTo(21.1945f, 9.8532f, 21.4965f, 10.2072f, 21.6812f, 10.5936f)
                curveTo(22.1063f, 11.483f, 22.1063f, 12.517f, 21.6812f, 13.4064f)
                curveTo(21.4965f, 13.7928f, 21.1945f, 14.1468f, 20.7763f, 14.6371f)
                curveTo(20.7546f, 14.6625f, 20.7326f, 14.6883f, 20.7103f, 14.7146f)
                curveTo(20.5074f, 14.9526f, 20.445f, 15.0276f, 20.3941f, 15.1035f)
                curveTo(20.2648f, 15.2965f, 20.175f, 15.5132f, 20.1301f, 15.7411f)
                curveTo(20.1124f, 15.8307f, 20.1035f, 15.9278f, 20.0786f, 16.2396f)
                curveTo(20.0758f, 16.2739f, 20.0732f, 16.3078f, 20.0705f, 16.3411f)
                curveTo(20.0195f, 16.9834f, 19.9827f, 17.4473f, 19.8401f, 17.8511f)
                curveTo(19.5118f, 18.7807f, 18.7807f, 19.5118f, 17.8511f, 19.8401f)
                curveTo(17.4473f, 19.9827f, 16.9834f, 20.0195f, 16.3411f, 20.0705f)
                curveTo(16.3078f, 20.0732f, 16.2739f, 20.0758f, 16.2396f, 20.0786f)
                curveTo(15.9278f, 20.1035f, 15.8307f, 20.1124f, 15.7411f, 20.1301f)
                curveTo(15.5132f, 20.175f, 15.2965f, 20.2648f, 15.1035f, 20.3941f)
                curveTo(15.0276f, 20.445f, 14.9526f, 20.5074f, 14.7146f, 20.7103f)
                curveTo(14.6883f, 20.7326f, 14.6625f, 20.7546f, 14.6371f, 20.7763f)
                curveTo(14.1468f, 21.1945f, 13.7928f, 21.4965f, 13.4064f, 21.6812f)
                curveTo(12.517f, 22.1063f, 11.483f, 22.1063f, 10.5936f, 21.6812f)
                curveTo(10.2072f, 21.4965f, 9.8532f, 21.1945f, 9.3629f, 20.7763f)
                curveTo(9.3375f, 20.7546f, 9.3117f, 20.7326f, 9.2854f, 20.7103f)
                curveTo(9.0474f, 20.5074f, 8.9724f, 20.445f, 8.8965f, 20.3941f)
                curveTo(8.7036f, 20.2648f, 8.4868f, 20.175f, 8.2589f, 20.1301f)
                curveTo(8.1693f, 20.1124f, 8.0722f, 20.1035f, 7.7604f, 20.0786f)
                curveTo(7.7261f, 20.0758f, 7.6922f, 20.0732f, 7.6589f, 20.0705f)
                curveTo(7.0166f, 20.0195f, 6.5527f, 19.9827f, 6.1488f, 19.8401f)
                curveTo(5.2193f, 19.5118f, 4.4882f, 18.7807f, 4.1599f, 17.8511f)
                curveTo(4.0173f, 17.4473f, 3.9805f, 16.9834f, 3.9295f, 16.3411f)
                curveTo(3.9269f, 16.3078f, 3.9242f, 16.2739f, 3.9214f, 16.2396f)
                curveTo(3.8965f, 15.9278f, 3.8876f, 15.8307f, 3.87f, 15.7411f)
                curveTo(3.8249f, 15.5132f, 3.7352f, 15.2965f, 3.6058f, 15.1035f)
                curveTo(3.555f, 15.0276f, 3.4926f, 14.9526f, 3.2897f, 14.7146f)
                curveTo(3.2674f, 14.6884f, 3.2454f, 14.6625f, 3.2237f, 14.6371f)
                curveTo(2.8055f, 14.1469f, 2.5035f, 13.7928f, 2.3188f, 13.4064f)
                curveTo(1.8937f, 12.517f, 1.8937f, 11.483f, 2.3188f, 10.5936f)
                curveTo(2.5035f, 10.2072f, 2.8055f, 9.8532f, 3.2237f, 9.3629f)
                curveTo(3.2454f, 9.3375f, 3.2674f, 9.3117f, 3.2897f, 9.2854f)
                curveTo(3.4926f, 9.0474f, 3.555f, 8.9724f, 3.6058f, 8.8965f)
                curveTo(3.7352f, 8.7036f, 3.8249f, 8.4868f, 3.87f, 8.2589f)
                curveTo(3.8876f, 8.1693f, 3.8965f, 8.0722f, 3.9214f, 7.7604f)
                curveTo(3.9242f, 7.7261f, 3.9269f, 7.6922f, 3.9295f, 7.6589f)
                curveTo(3.9805f, 7.0166f, 4.0173f, 6.5527f, 4.1599f, 6.1488f)
                curveTo(4.4882f, 5.2193f, 5.2193f, 4.4882f, 6.1488f, 4.1599f)
                curveTo(6.5527f, 4.0173f, 7.0166f, 3.9805f, 7.6589f, 3.9295f)
                curveTo(7.6922f, 3.9269f, 7.7261f, 3.9242f, 7.7604f, 3.9214f)
                curveTo(8.0722f, 3.8965f, 8.1693f, 3.8876f, 8.2589f, 3.87f)
                curveTo(8.4868f, 3.8249f, 8.7036f, 3.7352f, 8.8965f, 3.6058f)
                curveTo(8.9724f, 3.555f, 9.0474f, 3.4926f, 9.2854f, 3.2897f)
                curveTo(9.3117f, 3.2674f, 9.3375f, 3.2454f, 9.3629f, 3.2237f)
                curveTo(9.8532f, 2.8055f, 10.2072f, 2.5035f, 10.5936f, 2.3188f)
                close()
                moveTo(12.7573f, 3.6769f)
                curveTo(12.2784f, 3.448f, 11.7216f, 3.448f, 11.2427f, 3.6769f)
                curveTo(11.0576f, 3.7654f, 10.8624f, 3.9235f, 10.2618f, 4.4354f)
                curveTo(10.2519f, 4.4438f, 10.2422f, 4.4521f, 10.2326f, 4.4603f)
                curveTo(10.0354f, 4.6283f, 9.8916f, 4.751f, 9.7346f, 4.8562f)
                curveTo(9.3762f, 5.0964f, 8.9737f, 5.2631f, 8.5505f, 5.3467f)
                curveTo(8.3651f, 5.3833f, 8.1766f, 5.3983f, 7.9184f, 5.4188f)
                curveTo(7.9058f, 5.4198f, 7.893f, 5.4208f, 7.8801f, 5.4219f)
                curveTo(7.0935f, 5.4847f, 6.8437f, 5.5108f, 6.6502f, 5.5792f)
                curveTo(6.1497f, 5.756f, 5.756f, 6.1497f, 5.5792f, 6.6502f)
                curveTo(5.5108f, 6.8437f, 5.4847f, 7.0935f, 5.4219f, 7.8801f)
                curveTo(5.4208f, 7.893f, 5.4198f, 7.9058f, 5.4188f, 7.9184f)
                curveTo(5.3983f, 8.1766f, 5.3833f, 8.3651f, 5.3467f, 8.5505f)
                curveTo(5.2631f, 8.9737f, 5.0964f, 9.3762f, 4.8562f, 9.7346f)
                curveTo(4.751f, 9.8916f, 4.6283f, 10.0354f, 4.4602f, 10.2326f)
                curveTo(4.4521f, 10.2422f, 4.4438f, 10.2519f, 4.4354f, 10.2618f)
                curveTo(3.9235f, 10.8624f, 3.7654f, 11.0576f, 3.6769f, 11.2427f)
                curveTo(3.448f, 11.7216f, 3.448f, 12.2784f, 3.6769f, 12.7573f)
                curveTo(3.7654f, 12.9424f, 3.9235f, 13.1376f, 4.4354f, 13.7382f)
                curveTo(4.4438f, 13.7481f, 4.4521f, 13.7578f, 4.4603f, 13.7674f)
                curveTo(4.6283f, 13.9646f, 4.751f, 14.1084f, 4.8562f, 14.2654f)
                curveTo(5.0964f, 14.6238f, 5.2631f, 15.0263f, 5.3467f, 15.4495f)
                curveTo(5.3833f, 15.6349f, 5.3983f, 15.8234f, 5.4188f, 16.0816f)
                curveTo(5.4198f, 16.0942f, 5.4208f, 16.107f, 5.4219f, 16.1199f)
                curveTo(5.4847f, 16.9065f, 5.5108f, 17.1563f, 5.5792f, 17.3498f)
                curveTo(5.756f, 17.8503f, 6.1497f, 18.244f, 6.6502f, 18.4208f)
                curveTo(6.8437f, 18.4892f, 7.0935f, 18.5154f, 7.8801f, 18.5781f)
                lineTo(7.9184f, 18.5812f)
                curveTo(8.1766f, 18.6017f, 8.3651f, 18.6167f, 8.5505f, 18.6533f)
                curveTo(8.9737f, 18.7369f, 9.3762f, 18.9036f, 9.7346f, 19.1438f)
                curveTo(9.8916f, 19.249f, 10.0354f, 19.3717f, 10.2326f, 19.5397f)
                lineTo(10.2618f, 19.5646f)
                curveTo(10.8624f, 20.0765f, 11.0576f, 20.2346f, 11.2427f, 20.3231f)
                curveTo(11.7216f, 20.552f, 12.2784f, 20.552f, 12.7573f, 20.3231f)
                curveTo(12.9424f, 20.2346f, 13.1376f, 20.0765f, 13.7382f, 19.5646f)
                lineTo(13.7675f, 19.5397f)
                curveTo(13.9646f, 19.3717f, 14.1084f, 19.249f, 14.2654f, 19.1438f)
                curveTo(14.6238f, 18.9036f, 15.0263f, 18.7369f, 15.4495f, 18.6533f)
                curveTo(15.6349f, 18.6167f, 15.8234f, 18.6017f, 16.0816f, 18.5812f)
                lineTo(16.1199f, 18.5781f)
                curveTo(16.9065f, 18.5154f, 17.1563f, 18.4892f, 17.3498f, 18.4208f)
                curveTo(17.8503f, 18.244f, 18.244f, 17.8503f, 18.4208f, 17.3498f)
                curveTo(18.4892f, 17.1563f, 18.5154f, 16.9065f, 18.5781f, 16.1199f)
                lineTo(18.5812f, 16.0816f)
                curveTo(18.6017f, 15.8234f, 18.6167f, 15.6349f, 18.6533f, 15.4495f)
                curveTo(18.7369f, 15.0263f, 18.9036f, 14.6238f, 19.1438f, 14.2654f)
                curveTo(19.249f, 14.1084f, 19.3717f, 13.9646f, 19.5397f, 13.7675f)
                lineTo(19.5646f, 13.7382f)
                curveTo(20.0765f, 13.1376f, 20.2346f, 12.9424f, 20.3231f, 12.7573f)
                curveTo(20.552f, 12.2784f, 20.552f, 11.7216f, 20.3231f, 11.2427f)
                curveTo(20.2346f, 11.0576f, 20.0765f, 10.8624f, 19.5646f, 10.2618f)
                lineTo(19.5397f, 10.2325f)
                curveTo(19.3717f, 10.0354f, 19.249f, 9.8916f, 19.1438f, 9.7346f)
                curveTo(18.9036f, 9.3762f, 18.7369f, 8.9737f, 18.6533f, 8.5505f)
                curveTo(18.6167f, 8.3651f, 18.6017f, 8.1766f, 18.5812f, 7.9184f)
                lineTo(18.5781f, 7.8801f)
                curveTo(18.5154f, 7.0935f, 18.4892f, 6.8437f, 18.4208f, 6.6502f)
                curveTo(18.244f, 6.1497f, 17.8503f, 5.756f, 17.3498f, 5.5792f)
                curveTo(17.1563f, 5.5108f, 16.9065f, 5.4847f, 16.1199f, 5.4219f)
                curveTo(16.107f, 5.4208f, 16.0942f, 5.4198f, 16.0816f, 5.4188f)
                curveTo(15.8234f, 5.3983f, 15.6349f, 5.3833f, 15.4495f, 5.3467f)
                curveTo(15.0263f, 5.2631f, 14.6238f, 5.0964f, 14.2654f, 4.8562f)
                curveTo(14.1084f, 4.751f, 13.9646f, 4.6283f, 13.7674f, 4.4602f)
                curveTo(13.7578f, 4.4521f, 13.7481f, 4.4438f, 13.7382f, 4.4354f)
                curveTo(13.1376f, 3.9235f, 12.9424f, 3.7654f, 12.7573f, 3.6769f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.5426f, 8.4574f)
                curveTo(15.8365f, 8.7513f, 15.8365f, 9.2278f, 15.5426f, 9.5217f)
                lineTo(9.5217f, 15.5426f)
                curveTo(9.2278f, 15.8365f, 8.7513f, 15.8365f, 8.4574f, 15.5426f)
                curveTo(8.1635f, 15.2487f, 8.1635f, 14.7722f, 8.4574f, 14.4783f)
                lineTo(14.4783f, 8.4574f)
                curveTo(14.7722f, 8.1635f, 15.2487f, 8.1635f, 15.5426f, 8.4574f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5122f, 14.5087f)
                curveTo(15.5122f, 15.0629f, 15.0629f, 15.5122f, 14.5087f, 15.5122f)
                curveTo(13.9545f, 15.5122f, 13.5052f, 15.0629f, 13.5052f, 14.5087f)
                curveTo(13.5052f, 13.9545f, 13.9545f, 13.5052f, 14.5087f, 13.5052f)
                curveTo(15.0629f, 13.5052f, 15.5122f, 13.9545f, 15.5122f, 14.5087f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4948f, 9.4913f)
                curveTo(10.4948f, 10.0455f, 10.0455f, 10.4948f, 9.4913f, 10.4948f)
                curveTo(8.9371f, 10.4948f, 8.4878f, 10.0455f, 8.4878f, 9.4913f)
                curveTo(8.4878f, 8.9371f, 8.9371f, 8.4878f, 9.4913f, 8.4878f)
                curveTo(10.0455f, 8.4878f, 10.4948f, 8.9371f, 10.4948f, 9.4913f)
                close()
            }
        }
            .build()
        return _sale!!
    }

private var _sale: ImageVector? = null
