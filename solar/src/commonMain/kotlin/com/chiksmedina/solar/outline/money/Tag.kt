package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(
            name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.2383f, 2.7989f)
                curveTo(10.6243f, 2.88f, 9.866f, 3.0542f, 8.7874f, 3.3031f)
                lineTo(7.5592f, 3.5865f)
                curveTo(6.6482f, 3.7968f, 6.0208f, 3.9425f, 5.5416f, 4.107f)
                curveTo(5.079f, 4.2658f, 4.8173f, 4.4223f, 4.6198f, 4.6198f)
                curveTo(4.4223f, 4.8173f, 4.2658f, 5.079f, 4.107f, 5.5416f)
                curveTo(3.9425f, 6.0208f, 3.7968f, 6.6482f, 3.5865f, 7.5592f)
                lineTo(3.3031f, 8.7874f)
                curveTo(3.0542f, 9.866f, 2.88f, 10.6243f, 2.7989f, 11.2383f)
                curveTo(2.7198f, 11.8365f, 2.738f, 12.2413f, 2.8436f, 12.6092f)
                curveTo(2.9491f, 12.9772f, 3.1482f, 13.3301f, 3.5323f, 13.7954f)
                curveTo(3.9265f, 14.2731f, 4.4761f, 14.8238f, 5.2588f, 15.6066f)
                lineTo(7.0884f, 17.4362f)
                curveTo(8.4479f, 18.7957f, 9.4153f, 19.7608f, 10.247f, 20.3954f)
                curveTo(11.0614f, 21.0167f, 11.6569f, 21.25f, 12.2623f, 21.25f)
                curveTo(12.8678f, 21.25f, 13.4633f, 21.0167f, 14.2776f, 20.3954f)
                curveTo(15.1093f, 19.7608f, 16.0767f, 18.7957f, 17.4362f, 17.4362f)
                curveTo(18.7957f, 16.0767f, 19.7608f, 15.1093f, 20.3954f, 14.2776f)
                curveTo(21.0167f, 13.4633f, 21.25f, 12.8678f, 21.25f, 12.2623f)
                curveTo(21.25f, 11.6569f, 21.0167f, 11.0614f, 20.3954f, 10.247f)
                curveTo(19.7608f, 9.4153f, 18.7957f, 8.4479f, 17.4362f, 7.0884f)
                lineTo(15.6066f, 5.2588f)
                curveTo(14.8238f, 4.4761f, 14.2731f, 3.9265f, 13.7954f, 3.5323f)
                curveTo(13.3301f, 3.1482f, 12.9772f, 2.9491f, 12.6092f, 2.8436f)
                curveTo(12.2413f, 2.738f, 11.8365f, 2.7198f, 11.2383f, 2.7989f)
                close()
                moveTo(11.0418f, 1.3118f)
                curveTo(11.7591f, 1.217f, 12.3881f, 1.2197f, 13.0227f, 1.4017f)
                curveTo(13.6574f, 1.5837f, 14.1922f, 1.9148f, 14.7502f, 2.3754f)
                curveTo(15.2897f, 2.8206f, 15.8905f, 3.4214f, 16.641f, 4.172f)
                lineTo(18.5368f, 6.0677f)
                curveTo(19.8474f, 7.3783f, 20.8851f, 8.416f, 21.5879f, 9.3371f)
                curveTo(22.311f, 10.2849f, 22.75f, 11.197f, 22.75f, 12.2623f)
                curveTo(22.75f, 13.3276f, 22.311f, 14.2397f, 21.5879f, 15.1875f)
                curveTo(20.8851f, 16.1087f, 19.8474f, 17.1463f, 18.5368f, 18.4569f)
                lineTo(18.4569f, 18.5368f)
                curveTo(17.1463f, 19.8474f, 16.1087f, 20.8851f, 15.1875f, 21.5879f)
                curveTo(14.2397f, 22.311f, 13.3276f, 22.75f, 12.2623f, 22.75f)
                curveTo(11.197f, 22.75f, 10.2849f, 22.311f, 9.3371f, 21.5879f)
                curveTo(8.416f, 20.8851f, 7.3783f, 19.8474f, 6.0677f, 18.5368f)
                lineTo(4.172f, 16.641f)
                curveTo(3.4214f, 15.8905f, 2.8206f, 15.2897f, 2.3754f, 14.7502f)
                curveTo(1.9148f, 14.1922f, 1.5837f, 13.6574f, 1.4017f, 13.0227f)
                curveTo(1.2197f, 12.3881f, 1.217f, 11.7591f, 1.3118f, 11.0418f)
                curveTo(1.4035f, 10.3484f, 1.5945f, 9.5205f, 1.8332f, 8.4862f)
                lineTo(2.1339f, 7.1833f)
                curveTo(2.333f, 6.3202f, 2.4954f, 5.6164f, 2.6882f, 5.0547f)
                curveTo(2.8895f, 4.4681f, 3.1431f, 3.9751f, 3.5591f, 3.5591f)
                curveTo(3.9751f, 3.1431f, 4.4681f, 2.8895f, 5.0547f, 2.6882f)
                curveTo(5.6164f, 2.4954f, 6.3202f, 2.333f, 7.1834f, 2.1339f)
                lineTo(8.4862f, 1.8332f)
                curveTo(9.5205f, 1.5945f, 10.3484f, 1.4035f, 11.0418f, 1.3118f)
                close()
                moveTo(9.4909f, 7.9951f)
                curveTo(9.0028f, 7.507f, 8.2113f, 7.507f, 7.7232f, 7.9951f)
                curveTo(7.235f, 8.4833f, 7.235f, 9.2748f, 7.7232f, 9.7629f)
                curveTo(8.2113f, 10.2511f, 9.0028f, 10.2511f, 9.4909f, 9.7629f)
                curveTo(9.9791f, 9.2748f, 9.9791f, 8.4833f, 9.4909f, 7.9951f)
                close()
                moveTo(6.6625f, 6.9345f)
                curveTo(7.7365f, 5.8605f, 9.4777f, 5.8605f, 10.5516f, 6.9345f)
                curveTo(11.6255f, 8.0084f, 11.6255f, 9.7496f, 10.5516f, 10.8236f)
                curveTo(9.4777f, 11.8975f, 7.7365f, 11.8975f, 6.6625f, 10.8236f)
                curveTo(5.5886f, 9.7496f, 5.5886f, 8.0084f, 6.6625f, 6.9345f)
                close()
                moveTo(19.0511f, 10.9902f)
                curveTo(19.344f, 11.2831f, 19.344f, 11.7579f, 19.0511f, 12.0508f)
                lineTo(12.0721f, 19.0301f)
                curveTo(11.7792f, 19.323f, 11.3043f, 19.323f, 11.0114f, 19.0301f)
                curveTo(10.7185f, 18.7372f, 10.7185f, 18.2623f, 11.0114f, 17.9694f)
                lineTo(17.9904f, 10.9902f)
                curveTo(18.2833f, 10.6973f, 18.7582f, 10.6973f, 19.0511f, 10.9902f)
                close()
            }
        }
            .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
