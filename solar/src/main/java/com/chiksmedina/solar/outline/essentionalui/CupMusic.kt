package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.CupMusic: ImageVector
    get() {
        if (_cupMusic != null) {
            return _cupMusic!!
        }
        _cupMusic = Builder(name = "CupMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 4.25f)
                curveTo(13.4142f, 4.25f, 13.75f, 4.5858f, 13.75f, 5.0f)
                curveTo(13.75f, 5.6904f, 14.3096f, 6.25f, 15.0f, 6.25f)
                curveTo(15.4142f, 6.25f, 15.75f, 6.5858f, 15.75f, 7.0f)
                curveTo(15.75f, 7.4142f, 15.4142f, 7.75f, 15.0f, 7.75f)
                curveTo(14.5499f, 7.75f, 14.125f, 7.6419f, 13.75f, 7.4502f)
                verticalLineTo(10.5f)
                curveTo(13.75f, 11.7426f, 12.7426f, 12.75f, 11.5f, 12.75f)
                curveTo(10.2574f, 12.75f, 9.25f, 11.7426f, 9.25f, 10.5f)
                curveTo(9.25f, 9.2574f, 10.2574f, 8.25f, 11.5f, 8.25f)
                curveTo(11.763f, 8.25f, 12.0154f, 8.2951f, 12.25f, 8.378f)
                verticalLineTo(5.0f)
                curveTo(12.25f, 4.5858f, 12.5858f, 4.25f, 13.0f, 4.25f)
                close()
                moveTo(12.25f, 10.5f)
                curveTo(12.25f, 10.0858f, 11.9142f, 9.75f, 11.5f, 9.75f)
                curveTo(11.0858f, 9.75f, 10.75f, 10.0858f, 10.75f, 10.5f)
                curveTo(10.75f, 10.9142f, 11.0858f, 11.25f, 11.5f, 11.25f)
                curveTo(11.9142f, 11.25f, 12.25f, 10.9142f, 12.25f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.4984f, 1.6072f)
                curveTo(8.6613f, 1.411f, 10.1724f, 1.25f, 12.0002f, 1.25f)
                curveTo(13.8279f, 1.25f, 15.339f, 1.411f, 16.5019f, 1.6072f)
                lineTo(16.6368f, 1.6298f)
                curveTo(17.647f, 1.7989f, 18.4866f, 1.9395f, 19.1432f, 2.7481f)
                curveTo(19.5643f, 3.2667f, 19.7001f, 3.8271f, 19.7314f, 4.4532f)
                lineTo(20.2231f, 4.6171f)
                curveTo(20.6862f, 4.7715f, 21.0921f, 4.9068f, 21.4142f, 5.0566f)
                curveTo(21.7623f, 5.2185f, 22.0814f, 5.4271f, 22.3253f, 5.7656f)
                curveTo(22.5692f, 6.104f, 22.6662f, 6.4726f, 22.7097f, 6.8541f)
                curveTo(22.75f, 7.207f, 22.75f, 7.6349f, 22.7499f, 8.1231f)
                lineTo(22.7499f, 8.2683f)
                curveTo(22.7499f, 8.6701f, 22.75f, 9.025f, 22.7203f, 9.3218f)
                curveTo(22.6881f, 9.6435f, 22.6169f, 9.9562f, 22.4391f, 10.2584f)
                curveTo(22.2613f, 10.5607f, 22.0225f, 10.7748f, 21.7569f, 10.9591f)
                curveTo(21.5118f, 11.1292f, 21.2016f, 11.3015f, 20.8503f, 11.4966f)
                lineTo(18.2097f, 12.9637f)
                curveTo(17.6703f, 14.025f, 16.9292f, 14.9713f, 15.9101f, 15.6548f)
                curveTo(15.0354f, 16.2414f, 13.9881f, 16.6128f, 12.75f, 16.7187f)
                verticalLineTo(18.75f)
                horizontalLineTo(14.1802f)
                curveTo(15.0144f, 18.75f, 15.7326f, 19.3388f, 15.8962f, 20.1568f)
                lineTo(16.1149f, 21.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 21.25f, 18.75f, 21.5858f, 18.75f, 22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 22.75f, 5.25f, 22.4142f, 5.25f, 22.0f)
                curveTo(5.25f, 21.5858f, 5.5858f, 21.25f, 6.0f, 21.25f)
                horizontalLineTo(7.8851f)
                lineTo(8.1038f, 20.1568f)
                curveTo(8.2674f, 19.3388f, 8.9856f, 18.75f, 9.8198f, 18.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.7187f)
                curveTo(10.012f, 16.6127f, 8.9648f, 16.2414f, 8.0902f, 15.6548f)
                curveTo(7.0711f, 14.9713f, 6.3302f, 14.0252f, 5.7908f, 12.964f)
                lineTo(3.1496f, 11.4966f)
                curveTo(2.7984f, 11.3015f, 2.4881f, 11.1292f, 2.2431f, 10.9591f)
                curveTo(1.9775f, 10.7748f, 1.7387f, 10.5607f, 1.5608f, 10.2584f)
                curveTo(1.383f, 9.9562f, 1.3118f, 9.6435f, 1.2796f, 9.3218f)
                curveTo(1.25f, 9.025f, 1.25f, 8.6701f, 1.25f, 8.2683f)
                lineTo(1.25f, 8.123f)
                curveTo(1.25f, 7.6349f, 1.2499f, 7.207f, 1.2902f, 6.8541f)
                curveTo(1.3338f, 6.4726f, 1.4308f, 6.104f, 1.6747f, 5.7656f)
                curveTo(1.9186f, 5.4271f, 2.2376f, 5.2185f, 2.5858f, 5.0566f)
                curveTo(2.9078f, 4.9068f, 3.3137f, 4.7715f, 3.7769f, 4.6171f)
                lineTo(4.2689f, 4.4531f)
                curveTo(4.3002f, 3.8271f, 4.4361f, 3.2666f, 4.8571f, 2.7481f)
                curveTo(5.5137f, 1.9395f, 6.3533f, 1.7989f, 7.3636f, 1.6298f)
                lineTo(7.4984f, 1.6072f)
                close()
                moveTo(9.4149f, 21.25f)
                horizontalLineTo(14.5852f)
                lineTo(14.4253f, 20.451f)
                curveTo(14.402f, 20.3341f, 14.2994f, 20.25f, 14.1802f, 20.25f)
                horizontalLineTo(9.8198f)
                curveTo(9.7006f, 20.25f, 9.598f, 20.3341f, 9.5747f, 20.451f)
                lineTo(9.4149f, 21.25f)
                close()
                moveTo(4.3021f, 6.0232f)
                curveTo(4.3737f, 7.5435f, 4.5454f, 9.2238f, 4.973f, 10.7937f)
                lineTo(3.9073f, 10.2016f)
                curveTo(3.5181f, 9.9854f, 3.2745f, 9.8491f, 3.0983f, 9.7268f)
                curveTo(2.9359f, 9.6141f, 2.883f, 9.5476f, 2.8536f, 9.4977f)
                curveTo(2.8243f, 9.4479f, 2.7919f, 9.3693f, 2.7722f, 9.1726f)
                curveTo(2.7509f, 8.9593f, 2.75f, 8.68f, 2.75f, 8.2348f)
                lineTo(2.75f, 8.1623f)
                curveTo(2.75f, 7.6232f, 2.7511f, 7.2819f, 2.7805f, 7.0242f)
                curveTo(2.8077f, 6.7857f, 2.8523f, 6.697f, 2.8915f, 6.6426f)
                curveTo(2.9308f, 6.5882f, 3.0008f, 6.5179f, 3.2185f, 6.4166f)
                curveTo(3.4536f, 6.3072f, 3.7771f, 6.1982f, 4.2885f, 6.0277f)
                lineTo(4.3021f, 6.0232f)
                close()
                moveTo(19.0274f, 10.7934f)
                lineTo(20.0927f, 10.2016f)
                curveTo(20.4818f, 9.9854f, 20.7255f, 9.8491f, 20.9016f, 9.7268f)
                curveTo(21.0641f, 9.6141f, 21.117f, 9.5476f, 21.1463f, 9.4977f)
                curveTo(21.1757f, 9.4479f, 21.2081f, 9.3693f, 21.2277f, 9.1726f)
                curveTo(21.2491f, 8.9593f, 21.2499f, 8.68f, 21.2499f, 8.2348f)
                lineTo(21.2499f, 8.1623f)
                curveTo(21.25f, 7.6232f, 21.2488f, 7.2819f, 21.2194f, 7.0242f)
                curveTo(21.1922f, 6.7857f, 21.1476f, 6.697f, 21.1084f, 6.6426f)
                curveTo(21.0692f, 6.5882f, 20.9991f, 6.5179f, 20.7815f, 6.4166f)
                curveTo(20.5463f, 6.3072f, 20.2229f, 6.1982f, 19.7115f, 6.0277f)
                lineTo(19.6982f, 6.0233f)
                curveTo(19.6266f, 7.5435f, 19.4549f, 9.2236f, 19.0274f, 10.7934f)
                close()
                moveTo(12.0002f, 2.75f)
                curveTo(10.2608f, 2.75f, 8.8332f, 2.9032f, 7.748f, 3.0863f)
                curveTo(6.541f, 3.2899f, 6.2875f, 3.3661f, 6.0216f, 3.6936f)
                curveTo(5.7596f, 4.0163f, 5.7347f, 4.3216f, 5.7885f, 5.6767f)
                curveTo(5.8781f, 7.9354f, 6.1761f, 10.3727f, 7.0988f, 12.2264f)
                curveTo(7.5543f, 13.1414f, 8.1498f, 13.8887f, 8.9257f, 14.409f)
                curveTo(9.6966f, 14.9261f, 10.6911f, 15.25f, 12.0002f, 15.25f)
                curveTo(13.3092f, 15.25f, 14.3037f, 14.9261f, 15.0746f, 14.409f)
                curveTo(15.8505f, 13.8887f, 16.446f, 13.1414f, 16.9015f, 12.2264f)
                curveTo(17.8242f, 10.3727f, 18.1222f, 7.9354f, 18.2118f, 5.6767f)
                curveTo(18.2656f, 4.3216f, 18.2407f, 4.0163f, 17.9787f, 3.6936f)
                curveTo(17.7128f, 3.3661f, 17.4593f, 3.2899f, 16.2524f, 3.0863f)
                curveTo(15.1671f, 2.9032f, 13.7395f, 2.75f, 12.0002f, 2.75f)
                close()
            }
        }
        .build()
        return _cupMusic!!
    }

private var _cupMusic: ImageVector? = null
