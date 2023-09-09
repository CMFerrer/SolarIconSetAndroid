package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.HomeAngle2: ImageVector
    get() {
        if (_homeAngle2 != null) {
            return _homeAngle2!!
        }
        _homeAngle2 = Builder(name = "HomeAngle2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 14.5858f, 12.4142f, 14.25f, 12.0f, 14.25f)
                curveTo(11.5858f, 14.25f, 11.25f, 14.5858f, 11.25f, 15.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(11.2749f, 1.25f, 10.6134f, 1.4491f, 9.8893f, 1.7871f)
                curveTo(9.1883f, 2.1143f, 8.3777f, 2.5972f, 7.3618f, 3.2023f)
                lineTo(5.9062f, 4.0694f)
                curveTo(4.7871f, 4.7361f, 3.8953f, 5.2673f, 3.2201f, 5.7752f)
                curveTo(2.5231f, 6.2996f, 2.0f, 6.8396f, 1.6591f, 7.5507f)
                curveTo(1.318f, 8.2622f, 1.2255f, 9.0068f, 1.2552f, 9.8758f)
                curveTo(1.2839f, 10.717f, 1.431f, 11.7397f, 1.6156f, 13.0219f)
                lineTo(1.9079f, 15.0537f)
                curveTo(2.1453f, 16.7036f, 2.3337f, 18.0128f, 2.6151f, 19.0322f)
                curveTo(2.9052f, 20.0829f, 3.3169f, 20.9169f, 4.0596f, 21.5565f)
                curveTo(4.8018f, 22.1956f, 5.6898f, 22.4814f, 6.7763f, 22.6177f)
                curveTo(7.8315f, 22.75f, 9.1628f, 22.75f, 10.8423f, 22.75f)
                horizontalLineTo(13.1577f)
                curveTo(14.8372f, 22.75f, 16.1685f, 22.75f, 17.2237f, 22.6177f)
                curveTo(18.3102f, 22.4814f, 19.1982f, 22.1956f, 19.9404f, 21.5565f)
                curveTo(20.6831f, 20.9169f, 21.0948f, 20.0829f, 21.3849f, 19.0322f)
                curveTo(21.6663f, 18.0129f, 21.8547f, 16.7036f, 22.0921f, 15.0537f)
                lineTo(22.3844f, 13.0219f)
                curveTo(22.569f, 11.7396f, 22.7161f, 10.717f, 22.7448f, 9.8758f)
                curveTo(22.7745f, 9.0068f, 22.682f, 8.2622f, 22.3409f, 7.5507f)
                curveTo(22.0f, 6.8396f, 21.4769f, 6.2996f, 20.7799f, 5.7752f)
                curveTo(20.1047f, 5.2673f, 19.2129f, 4.7361f, 18.0938f, 4.0694f)
                lineTo(16.6382f, 3.2023f)
                curveTo(15.6223f, 2.5972f, 14.8117f, 2.1143f, 14.1107f, 1.7871f)
                curveTo(13.3866f, 1.4491f, 12.7251f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.0956f, 4.5112f)
                curveTo(9.1531f, 3.8813f, 9.8992f, 3.4378f, 10.5237f, 3.1463f)
                curveTo(11.1328f, 2.862f, 11.5708f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4293f, 2.75f, 12.8672f, 2.862f, 13.4763f, 3.1463f)
                curveTo(14.1008f, 3.4378f, 14.8469f, 3.8813f, 15.9044f, 4.5112f)
                lineTo(17.2893f, 5.3362f)
                curveTo(18.4536f, 6.0297f, 19.2752f, 6.5203f, 19.8781f, 6.9739f)
                curveTo(20.4665f, 7.4166f, 20.7888f, 7.7829f, 20.9883f, 8.1992f)
                curveTo(21.1877f, 8.6151f, 21.2706f, 9.0934f, 21.2457f, 9.8247f)
                curveTo(21.2201f, 10.5745f, 21.0856f, 11.5163f, 20.8936f, 12.8511f)
                lineTo(20.6148f, 14.7884f)
                curveTo(20.3683f, 16.5016f, 20.1921f, 17.7162f, 19.939f, 18.633f)
                curveTo(19.6916f, 19.5289f, 19.3939f, 20.0476f, 18.9616f, 20.4198f)
                curveTo(18.5287f, 20.7926f, 17.9676f, 21.0127f, 17.037f, 21.1294f)
                curveTo(16.086f, 21.2486f, 14.8488f, 21.25f, 13.1061f, 21.25f)
                horizontalLineTo(10.8939f)
                curveTo(9.1512f, 21.25f, 7.9141f, 21.2486f, 6.963f, 21.1294f)
                curveTo(6.0325f, 21.0127f, 5.4713f, 20.7926f, 5.0384f, 20.4198f)
                curveTo(4.6061f, 20.0476f, 4.3084f, 19.5289f, 4.061f, 18.633f)
                curveTo(3.8079f, 17.7162f, 3.6317f, 16.5016f, 3.3852f, 14.7884f)
                lineTo(3.1064f, 12.851f)
                curveTo(2.9144f, 11.5163f, 2.7799f, 10.5745f, 2.7543f, 9.8247f)
                curveTo(2.7294f, 9.0934f, 2.8123f, 8.6151f, 3.0117f, 8.1992f)
                curveTo(3.2112f, 7.7829f, 3.5335f, 7.4166f, 4.1219f, 6.9739f)
                curveTo(4.7248f, 6.5203f, 5.5464f, 6.0297f, 6.7107f, 5.3362f)
                lineTo(8.0956f, 4.5112f)
                close()
            }
        }
        .build()
        return _homeAngle2!!
    }

private var _homeAngle2: ImageVector? = null
