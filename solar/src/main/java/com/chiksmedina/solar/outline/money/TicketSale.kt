package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.TicketSale: ImageVector
    get() {
        if (_ticketSale != null) {
            return _ticketSale!!
        }
        _ticketSale = Builder(name = "TicketSale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9387f, 3.25f)
                horizontalLineTo(14.0613f)
                curveTo(15.9039f, 3.25f, 17.3629f, 3.25f, 18.5047f, 3.4031f)
                curveTo(19.6795f, 3.5607f, 20.6302f, 3.8925f, 21.3801f, 4.6406f)
                curveTo(22.4097f, 5.6676f, 22.6599f, 7.0819f, 22.7388f, 8.958f)
                lineTo(22.7398f, 8.9821f)
                curveTo(22.7467f, 9.146f, 22.7538f, 9.3133f, 22.7476f, 9.4542f)
                curveTo(22.741f, 9.6041f, 22.7178f, 9.8205f, 22.5981f, 10.0344f)
                curveTo(22.5153f, 10.1823f, 22.4044f, 10.2846f, 22.3304f, 10.3458f)
                curveTo(22.2503f, 10.4122f, 22.1613f, 10.4724f, 22.0764f, 10.5259f)
                curveTo(21.9127f, 10.6292f, 21.6913f, 10.7529f, 21.4317f, 10.8978f)
                lineTo(21.4126f, 10.9085f)
                curveTo(21.0269f, 11.1239f, 20.7699f, 11.533f, 20.7699f, 12.0f)
                curveTo(20.7699f, 12.467f, 21.0269f, 12.8761f, 21.4126f, 13.0915f)
                lineTo(21.4318f, 13.1022f)
                curveTo(21.6913f, 13.2472f, 21.9127f, 13.3708f, 22.0764f, 13.4741f)
                curveTo(22.1613f, 13.5276f, 22.2503f, 13.5878f, 22.3304f, 13.6542f)
                curveTo(22.4044f, 13.7154f, 22.5153f, 13.8177f, 22.5981f, 13.9656f)
                curveTo(22.7178f, 14.1795f, 22.741f, 14.3959f, 22.7476f, 14.5458f)
                curveTo(22.7538f, 14.6867f, 22.7467f, 14.854f, 22.7398f, 15.0179f)
                lineTo(22.7388f, 15.042f)
                curveTo(22.6599f, 16.9182f, 22.4097f, 18.3324f, 21.3801f, 19.3594f)
                curveTo(20.6302f, 20.1074f, 19.6795f, 20.4393f, 18.5047f, 20.5969f)
                curveTo(17.3629f, 20.75f, 15.9038f, 20.75f, 14.0613f, 20.75f)
                horizontalLineTo(9.9387f)
                curveTo(8.0962f, 20.75f, 6.6371f, 20.75f, 5.4953f, 20.5969f)
                curveTo(4.3205f, 20.4393f, 3.3698f, 20.1074f, 2.6199f, 19.3594f)
                curveTo(1.5904f, 18.3324f, 1.3401f, 16.9182f, 1.2613f, 15.042f)
                lineTo(1.2602f, 15.0179f)
                curveTo(1.2533f, 14.854f, 1.2463f, 14.6867f, 1.2524f, 14.5458f)
                curveTo(1.259f, 14.3959f, 1.2822f, 14.1795f, 1.4019f, 13.9656f)
                curveTo(1.4848f, 13.8177f, 1.5957f, 13.7154f, 1.6696f, 13.6542f)
                curveTo(1.7497f, 13.5878f, 1.8387f, 13.5276f, 1.9236f, 13.4741f)
                curveTo(2.0873f, 13.3708f, 2.3087f, 13.2471f, 2.5683f, 13.1022f)
                lineTo(2.5874f, 13.0915f)
                curveTo(2.9731f, 12.8761f, 3.2301f, 12.467f, 3.2301f, 12.0f)
                curveTo(3.2301f, 11.533f, 2.9731f, 11.1239f, 2.5874f, 10.9085f)
                lineTo(2.5683f, 10.8978f)
                curveTo(2.3087f, 10.7529f, 2.0873f, 10.6292f, 1.9236f, 10.5259f)
                curveTo(1.8387f, 10.4724f, 1.7497f, 10.4122f, 1.6696f, 10.3458f)
                curveTo(1.5957f, 10.2846f, 1.4847f, 10.1823f, 1.4019f, 10.0344f)
                curveTo(1.2822f, 9.8205f, 1.259f, 9.6041f, 1.2524f, 9.4542f)
                curveTo(1.2463f, 9.3133f, 1.2533f, 9.146f, 1.2602f, 8.9822f)
                curveTo(1.2606f, 8.9741f, 1.2609f, 8.966f, 1.2613f, 8.958f)
                curveTo(1.3401f, 7.0819f, 1.5904f, 5.6676f, 2.6199f, 4.6406f)
                curveTo(3.3698f, 3.8925f, 4.3205f, 3.5607f, 5.4953f, 3.4031f)
                curveTo(6.6371f, 3.25f, 8.0962f, 3.25f, 9.9387f, 3.25f)
                close()
                moveTo(21.2469f, 14.5842f)
                curveTo(21.2469f, 14.5842f, 21.2471f, 14.5852f, 21.2473f, 14.5875f)
                close()
                moveTo(21.2493f, 14.726f)
                curveTo(21.2492f, 14.7325f, 21.249f, 14.7394f, 21.2488f, 14.7464f)
                curveTo(21.2472f, 14.8104f, 21.2441f, 14.8847f, 21.2401f, 14.979f)
                curveTo(21.1621f, 16.8351f, 20.9085f, 17.7111f, 20.3208f, 18.2974f)
                curveTo(19.8962f, 18.721f, 19.3145f, 18.9749f, 18.3053f, 19.1102f)
                curveTo(17.2748f, 19.2484f, 15.9165f, 19.25f, 14.005f, 19.25f)
                horizontalLineTo(9.995f)
                curveTo(8.0836f, 19.25f, 6.7252f, 19.2484f, 5.6947f, 19.1102f)
                curveTo(4.6856f, 18.9749f, 4.1038f, 18.721f, 3.6793f, 18.2974f)
                curveTo(3.0915f, 17.7111f, 2.838f, 16.8351f, 2.7599f, 14.979f)
                curveTo(2.756f, 14.8847f, 2.7529f, 14.8104f, 2.7512f, 14.7464f)
                curveTo(2.751f, 14.7394f, 2.7509f, 14.7325f, 2.7507f, 14.726f)
                curveTo(2.8754f, 14.649f, 3.0544f, 14.5488f, 3.3188f, 14.4012f)
                curveTo(4.1586f, 13.9322f, 4.7301f, 13.0336f, 4.7301f, 12.0f)
                curveTo(4.7301f, 10.9664f, 4.1586f, 10.0678f, 3.3188f, 9.5988f)
                curveTo(3.0544f, 9.4512f, 2.8754f, 9.351f, 2.7507f, 9.274f)
                curveTo(2.7509f, 9.2675f, 2.751f, 9.2606f, 2.7512f, 9.2536f)
                curveTo(2.7529f, 9.1896f, 2.756f, 9.1153f, 2.7599f, 9.021f)
                curveTo(2.838f, 7.1649f, 3.0915f, 6.2889f, 3.6793f, 5.7026f)
                curveTo(4.1038f, 5.279f, 4.6856f, 5.0251f, 5.6947f, 4.8898f)
                curveTo(6.7252f, 4.7516f, 8.0836f, 4.75f, 9.995f, 4.75f)
                horizontalLineTo(14.005f)
                curveTo(15.9165f, 4.75f, 17.2748f, 4.7516f, 18.3053f, 4.8898f)
                curveTo(19.3145f, 5.0251f, 19.8962f, 5.279f, 20.3208f, 5.7026f)
                curveTo(20.9085f, 6.2889f, 21.1621f, 7.1649f, 21.2401f, 9.021f)
                curveTo(21.2441f, 9.1153f, 21.2472f, 9.1896f, 21.2488f, 9.2536f)
                curveTo(21.249f, 9.2606f, 21.2492f, 9.2675f, 21.2493f, 9.274f)
                curveTo(21.1246f, 9.351f, 20.9456f, 9.4512f, 20.6813f, 9.5988f)
                curveTo(19.8414f, 10.0678f, 19.2699f, 10.9664f, 19.2699f, 12.0f)
                curveTo(19.2699f, 13.0336f, 19.8414f, 13.9322f, 20.6813f, 14.4012f)
                curveTo(20.9456f, 14.5488f, 21.1246f, 14.649f, 21.2493f, 14.726f)
                close()
                moveTo(21.3735f, 9.1907f)
                lineTo(21.3724f, 9.1917f)
                curveTo(21.3766f, 9.1878f, 21.3774f, 9.1875f, 21.3735f, 9.1907f)
                close()
                moveTo(21.2469f, 9.4158f)
                curveTo(21.2469f, 9.4158f, 21.247f, 9.4146f, 21.2473f, 9.4125f)
                close()
                moveTo(2.6265f, 9.1907f)
                curveTo(2.6226f, 9.1875f, 2.6234f, 9.1878f, 2.6276f, 9.1917f)
                lineTo(2.6265f, 9.1907f)
                close()
                moveTo(2.7527f, 9.4125f)
                curveTo(2.7531f, 9.4146f, 2.7531f, 9.4158f, 2.7531f, 9.4158f)
                close()
                moveTo(2.7531f, 14.5842f)
                curveTo(2.7531f, 14.5842f, 2.7531f, 14.5854f, 2.7527f, 14.5875f)
                close()
                moveTo(2.6276f, 14.8084f)
                curveTo(2.6234f, 14.8122f, 2.6226f, 14.8125f, 2.6265f, 14.8093f)
                lineTo(2.6276f, 14.8084f)
                close()
                moveTo(21.3724f, 14.8084f)
                lineTo(21.3735f, 14.8093f)
                curveTo(21.3774f, 14.8125f, 21.3766f, 14.8122f, 21.3724f, 14.8084f)
                close()
                moveTo(15.5303f, 8.4697f)
                curveTo(15.8232f, 8.7626f, 15.8232f, 9.2374f, 15.5303f, 9.5303f)
                lineTo(9.5303f, 15.5303f)
                curveTo(9.2374f, 15.8232f, 8.7626f, 15.8232f, 8.4697f, 15.5303f)
                curveTo(8.1768f, 15.2374f, 8.1768f, 14.7626f, 8.4697f, 14.4697f)
                lineTo(14.4697f, 8.4697f)
                curveTo(14.7626f, 8.1768f, 15.2374f, 8.1768f, 15.5303f, 8.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.5f)
                curveTo(15.5f, 15.0523f, 15.0523f, 15.5f, 14.5f, 15.5f)
                curveTo(13.9477f, 15.5f, 13.5f, 15.0523f, 13.5f, 14.5f)
                curveTo(13.5f, 13.9477f, 13.9477f, 13.5f, 14.5f, 13.5f)
                curveTo(15.0523f, 13.5f, 15.5f, 13.9477f, 15.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 9.5f)
                curveTo(10.5f, 10.0523f, 10.0523f, 10.5f, 9.5f, 10.5f)
                curveTo(8.9477f, 10.5f, 8.5f, 10.0523f, 8.5f, 9.5f)
                curveTo(8.5f, 8.9477f, 8.9477f, 8.5f, 9.5f, 8.5f)
                curveTo(10.0523f, 8.5f, 10.5f, 8.9477f, 10.5f, 9.5f)
                close()
            }
        }
        .build()
        return _ticketSale!!
    }

private var _ticketSale: ImageVector? = null
