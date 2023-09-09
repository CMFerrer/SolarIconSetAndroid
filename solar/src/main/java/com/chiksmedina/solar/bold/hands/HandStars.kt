package com.chiksmedina.solar.bold.hands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.HandsGroup

public val HandsGroup.HandStars: ImageVector
    get() {
        if (_handStars != null) {
            return _handStars!!
        }
        _handStars = Builder(name = "HandStars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2599f, 21.3884f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 21.3884f, 4.5858f, 21.3884f, 4.2929f, 21.0955f)
                curveTo(4.0f, 20.8026f, 4.0f, 20.3312f, 4.0f, 19.3884f)
                verticalLineTo(18.2764f)
                curveTo(4.0f, 17.7579f, 4.0f, 17.4987f, 4.1332f, 17.2672f)
                curveTo(4.2664f, 17.0356f, 4.4673f, 16.9188f, 4.8691f, 16.6851f)
                curveTo(7.5146f, 15.1464f, 11.2715f, 14.2803f, 13.7791f, 15.7759f)
                curveTo(13.9475f, 15.8764f, 14.0991f, 15.9977f, 14.2285f, 16.1431f)
                curveTo(14.7866f, 16.77f, 14.746f, 17.7161f, 14.1028f, 18.2775f)
                curveTo(13.9669f, 18.396f, 13.8222f, 18.486f, 13.6764f, 18.5172f)
                curveTo(13.7962f, 18.5033f, 13.911f, 18.4874f, 14.0206f, 18.4699f)
                curveTo(14.932f, 18.3245f, 15.697f, 17.8375f, 16.3974f, 17.3084f)
                lineTo(18.2046f, 15.9433f)
                curveTo(18.8417f, 15.462f, 19.7873f, 15.4619f, 20.4245f, 15.943f)
                curveTo(20.9982f, 16.3762f, 21.1736f, 17.0894f, 20.8109f, 17.6707f)
                curveTo(20.388f, 18.3487f, 19.7921f, 19.216f, 19.2199f, 19.7459f)
                curveTo(18.6469f, 20.2766f, 17.7939f, 20.7504f, 17.0975f, 21.0865f)
                curveTo(16.326f, 21.4589f, 15.4738f, 21.6734f, 14.6069f, 21.8138f)
                curveTo(12.8488f, 22.0983f, 11.0166f, 22.0549f, 9.2763f, 21.6964f)
                curveTo(8.2925f, 21.4937f, 7.2708f, 21.3884f, 6.2599f, 21.3884f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8613f, 3.3633f)
                curveTo(11.3679f, 2.4544f, 11.6213f, 2.0f, 12.0f, 2.0f)
                curveTo(12.3787f, 2.0f, 12.6321f, 2.4544f, 13.1387f, 3.3633f)
                lineTo(13.2698f, 3.5985f)
                curveTo(13.4138f, 3.8568f, 13.4858f, 3.9859f, 13.598f, 4.0711f)
                curveTo(13.7103f, 4.1563f, 13.8501f, 4.188f, 14.1296f, 4.2512f)
                lineTo(14.3842f, 4.3088f)
                curveTo(15.3681f, 4.5314f, 15.86f, 4.6427f, 15.977f, 5.0191f)
                curveTo(16.0941f, 5.3955f, 15.7587f, 5.7876f, 15.088f, 6.572f)
                lineTo(14.9144f, 6.7749f)
                curveTo(14.7238f, 6.9978f, 14.6285f, 7.1092f, 14.5857f, 7.2471f)
                curveTo(14.5428f, 7.385f, 14.5572f, 7.5336f, 14.586f, 7.831f)
                lineTo(14.6122f, 8.1018f)
                curveTo(14.7136f, 9.1482f, 14.7644f, 9.6715f, 14.4579f, 9.9041f)
                curveTo(14.1515f, 10.1367f, 13.6909f, 9.9246f, 12.7697f, 9.5005f)
                lineTo(12.5314f, 9.3907f)
                curveTo(12.2696f, 9.2702f, 12.1387f, 9.2099f, 12.0f, 9.2099f)
                curveTo(11.8613f, 9.2099f, 11.7304f, 9.2702f, 11.4686f, 9.3907f)
                lineTo(11.2303f, 9.5005f)
                curveTo(10.3091f, 9.9246f, 9.8485f, 10.1367f, 9.5421f, 9.9041f)
                curveTo(9.2357f, 9.6715f, 9.2864f, 9.1482f, 9.3878f, 8.1018f)
                lineTo(9.414f, 7.831f)
                curveTo(9.4428f, 7.5336f, 9.4572f, 7.385f, 9.4143f, 7.2471f)
                curveTo(9.3715f, 7.1092f, 9.2762f, 6.9978f, 9.0856f, 6.7749f)
                lineTo(8.912f, 6.572f)
                curveTo(8.2413f, 5.7876f, 7.9059f, 5.3955f, 8.023f, 5.0191f)
                curveTo(8.14f, 4.6427f, 8.6319f, 4.5314f, 9.6158f, 4.3088f)
                lineTo(9.8703f, 4.2512f)
                curveTo(10.1499f, 4.188f, 10.2897f, 4.1563f, 10.402f, 4.0711f)
                curveTo(10.5142f, 3.9859f, 10.5862f, 3.8568f, 10.7302f, 3.5985f)
                lineTo(10.8613f, 3.3633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4306f, 7.6817f)
                curveTo(19.684f, 7.2272f, 19.8106f, 7.0f, 20.0f, 7.0f)
                curveTo(20.1894f, 7.0f, 20.316f, 7.2272f, 20.5694f, 7.6817f)
                lineTo(20.6349f, 7.7993f)
                curveTo(20.7069f, 7.9284f, 20.7429f, 7.993f, 20.799f, 8.0356f)
                curveTo(20.8551f, 8.0782f, 20.925f, 8.094f, 21.0648f, 8.1256f)
                lineTo(21.1921f, 8.1544f)
                curveTo(21.684f, 8.2657f, 21.93f, 8.3214f, 21.9885f, 8.5096f)
                curveTo(22.047f, 8.6977f, 21.8794f, 8.8938f, 21.544f, 9.286f)
                lineTo(21.4572f, 9.3874f)
                curveTo(21.3619f, 9.4989f, 21.3143f, 9.5546f, 21.2928f, 9.6235f)
                curveTo(21.2714f, 9.6925f, 21.2786f, 9.7668f, 21.293f, 9.9155f)
                lineTo(21.3061f, 10.0509f)
                curveTo(21.3568f, 10.5741f, 21.3822f, 10.8357f, 21.229f, 10.952f)
                curveTo(21.0758f, 11.0683f, 20.8455f, 10.9623f, 20.3849f, 10.7502f)
                lineTo(20.2657f, 10.6954f)
                curveTo(20.1348f, 10.6351f, 20.0694f, 10.605f, 20.0f, 10.605f)
                curveTo(19.9306f, 10.605f, 19.8652f, 10.6351f, 19.7343f, 10.6954f)
                lineTo(19.6151f, 10.7502f)
                curveTo(19.1545f, 10.9623f, 18.9242f, 11.0683f, 18.771f, 10.952f)
                curveTo(18.6178f, 10.8357f, 18.6432f, 10.5741f, 18.6939f, 10.0509f)
                lineTo(18.707f, 9.9155f)
                curveTo(18.7214f, 9.7668f, 18.7286f, 9.6925f, 18.7072f, 9.6235f)
                curveTo(18.6857f, 9.5546f, 18.6381f, 9.4989f, 18.5428f, 9.3874f)
                lineTo(18.456f, 9.286f)
                curveTo(18.1207f, 8.8938f, 17.953f, 8.6977f, 18.0115f, 8.5096f)
                curveTo(18.07f, 8.3214f, 18.316f, 8.2657f, 18.8079f, 8.1544f)
                lineTo(18.9352f, 8.1256f)
                curveTo(19.075f, 8.094f, 19.1449f, 8.0782f, 19.201f, 8.0356f)
                curveTo(19.2571f, 7.993f, 19.2931f, 7.9284f, 19.3651f, 7.7993f)
                lineTo(19.4306f, 7.6817f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4306f, 7.6817f)
                curveTo(3.684f, 7.2272f, 3.8106f, 7.0f, 4.0f, 7.0f)
                curveTo(4.1894f, 7.0f, 4.316f, 7.2272f, 4.5694f, 7.6817f)
                lineTo(4.6349f, 7.7993f)
                curveTo(4.7069f, 7.9284f, 4.7429f, 7.993f, 4.799f, 8.0356f)
                curveTo(4.8551f, 8.0782f, 4.925f, 8.094f, 5.0648f, 8.1256f)
                lineTo(5.1921f, 8.1544f)
                curveTo(5.684f, 8.2657f, 5.93f, 8.3214f, 5.9885f, 8.5096f)
                curveTo(6.047f, 8.6977f, 5.8794f, 8.8938f, 5.544f, 9.286f)
                lineTo(5.4572f, 9.3874f)
                curveTo(5.3619f, 9.4989f, 5.3143f, 9.5546f, 5.2928f, 9.6235f)
                curveTo(5.2714f, 9.6925f, 5.2786f, 9.7668f, 5.293f, 9.9155f)
                lineTo(5.3061f, 10.0509f)
                curveTo(5.3568f, 10.5741f, 5.3822f, 10.8357f, 5.229f, 10.952f)
                curveTo(5.0758f, 11.0683f, 4.8455f, 10.9623f, 4.3849f, 10.7502f)
                lineTo(4.2657f, 10.6954f)
                curveTo(4.1348f, 10.6351f, 4.0694f, 10.605f, 4.0f, 10.605f)
                curveTo(3.9306f, 10.605f, 3.8652f, 10.6351f, 3.7343f, 10.6954f)
                lineTo(3.6151f, 10.7502f)
                curveTo(3.1545f, 10.9623f, 2.9242f, 11.0683f, 2.771f, 10.952f)
                curveTo(2.6178f, 10.8357f, 2.6432f, 10.5741f, 2.6939f, 10.0509f)
                lineTo(2.707f, 9.9155f)
                curveTo(2.7214f, 9.7668f, 2.7286f, 9.6925f, 2.7072f, 9.6235f)
                curveTo(2.6857f, 9.5546f, 2.6381f, 9.4989f, 2.5428f, 9.3874f)
                lineTo(2.456f, 9.286f)
                curveTo(2.1207f, 8.8938f, 1.953f, 8.6977f, 2.0115f, 8.5096f)
                curveTo(2.07f, 8.3214f, 2.316f, 8.2657f, 2.8079f, 8.1544f)
                lineTo(2.9352f, 8.1256f)
                curveTo(3.075f, 8.094f, 3.1449f, 8.0782f, 3.201f, 8.0356f)
                curveTo(3.2571f, 7.993f, 3.2931f, 7.9284f, 3.3651f, 7.7993f)
                lineTo(3.4306f, 7.6817f)
                close()
            }
        }
        .build()
        return _handStars!!
    }

private var _handStars: ImageVector? = null
