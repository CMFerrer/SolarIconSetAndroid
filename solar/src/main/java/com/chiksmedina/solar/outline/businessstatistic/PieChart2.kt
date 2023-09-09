package com.chiksmedina.solar.outline.businessstatistic

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
import com.chiksmedina.solar.outline.BusinessStatisticGroup

public val BusinessStatisticGroup.PieChart2: ImageVector
    get() {
        if (_pieChart2 != null) {
            return _pieChart2!!
        }
        _pieChart2 = Builder(name = "PieChart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.2059f, 1.8561f)
                curveTo(16.1431f, 1.4374f, 15.116f, 1.7208f, 14.389f, 2.3674f)
                curveTo(13.6798f, 2.9981f, 13.25f, 3.9698f, 13.25f, 4.9999f)
                verticalLineTo(8.9999f)
                curveTo(13.25f, 9.9664f, 14.0335f, 10.7499f, 15.0f, 10.7499f)
                horizontalLineTo(19.0f)
                curveTo(20.0301f, 10.7499f, 21.0018f, 10.3201f, 21.6325f, 9.6109f)
                curveTo(22.2791f, 8.8839f, 22.5625f, 7.8568f, 22.1438f, 6.794f)
                curveTo(21.2558f, 4.5398f, 19.4601f, 2.7441f, 17.2059f, 1.8561f)
                close()
                moveTo(14.75f, 8.9999f)
                verticalLineTo(4.9999f)
                curveTo(14.75f, 4.3732f, 15.0149f, 3.8182f, 15.3858f, 3.4883f)
                curveTo(15.7389f, 3.1742f, 16.1774f, 3.0631f, 16.6561f, 3.2517f)
                curveTo(18.5233f, 3.9873f, 20.0127f, 5.4766f, 20.7482f, 7.3438f)
                curveTo(20.9368f, 7.8225f, 20.8257f, 8.261f, 20.5117f, 8.6141f)
                curveTo(20.1817f, 8.985f, 19.6267f, 9.2499f, 19.0f, 9.2499f)
                horizontalLineTo(15.0f)
                curveTo(14.8619f, 9.2499f, 14.75f, 9.138f, 14.75f, 8.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9953f, 2.8698f)
                curveTo(10.3847f, 2.4743f, 9.7942f, 2.3605f, 9.1457f, 2.4735f)
                curveTo(8.595f, 2.5696f, 8.0055f, 2.8337f, 7.3782f, 3.1149f)
                lineTo(7.3106f, 3.1451f)
                curveTo(6.7887f, 3.3789f, 6.2851f, 3.6568f, 5.8054f, 3.9773f)
                curveTo(4.1198f, 5.1036f, 2.806f, 6.7045f, 2.0302f, 8.5774f)
                curveTo(1.2544f, 10.4503f, 1.0515f, 12.5113f, 1.447f, 14.4996f)
                curveTo(1.8425f, 16.4879f, 2.8187f, 18.3143f, 4.2522f, 19.7477f)
                curveTo(5.6856f, 21.1812f, 7.512f, 22.1574f, 9.5003f, 22.5529f)
                curveTo(11.4886f, 22.9484f, 13.5496f, 22.7455f, 15.4225f, 21.9697f)
                curveTo(17.2955f, 21.1939f, 18.8963f, 19.8801f, 20.0226f, 18.1945f)
                curveTo(20.3431f, 17.7148f, 20.621f, 17.2112f, 20.8547f, 16.6893f)
                lineTo(20.885f, 16.6217f)
                curveTo(21.1662f, 15.9944f, 21.4303f, 15.4049f, 21.5264f, 14.8542f)
                curveTo(21.6394f, 14.2057f, 21.5256f, 13.6152f, 21.1301f, 13.0046f)
                curveTo(20.7036f, 12.3465f, 20.1199f, 12.0248f, 19.406f, 11.8791f)
                curveTo(18.7721f, 11.7497f, 17.98f, 11.7498f, 17.0722f, 11.7499f)
                lineTo(15.5f, 11.7499f)
                curveTo(14.536f, 11.7499f, 13.8884f, 11.7483f, 13.4054f, 11.6834f)
                curveTo(12.9439f, 11.6213f, 12.7464f, 11.5141f, 12.6161f, 11.3838f)
                curveTo(12.4858f, 11.2535f, 12.3786f, 11.056f, 12.3165f, 10.5945f)
                curveTo(12.2516f, 10.1115f, 12.25f, 9.4639f, 12.25f, 8.4999f)
                lineTo(12.25f, 6.9277f)
                curveTo(12.2501f, 6.0199f, 12.2502f, 5.2278f, 12.1208f, 4.5939f)
                curveTo(11.9751f, 3.88f, 11.6534f, 3.2963f, 10.9953f, 2.8698f)
                close()
                moveTo(7.9236f, 4.5141f)
                curveTo(8.6428f, 4.1921f, 9.0597f, 4.0111f, 9.4034f, 3.9512f)
                curveTo(9.669f, 3.9049f, 9.8776f, 3.9331f, 10.1797f, 4.1287f)
                curveTo(10.434f, 4.2935f, 10.5687f, 4.4903f, 10.6511f, 4.8939f)
                curveTo(10.7464f, 5.3609f, 10.75f, 5.9983f, 10.75f, 6.9999f)
                lineTo(10.75f, 8.5519f)
                curveTo(10.75f, 9.4504f, 10.7499f, 10.1996f, 10.8299f, 10.7944f)
                curveTo(10.9143f, 11.4222f, 11.1f, 11.989f, 11.5555f, 12.4444f)
                curveTo(12.0109f, 12.8999f, 12.5777f, 13.0856f, 13.2055f, 13.17f)
                curveTo(13.8003f, 13.2499f, 14.5495f, 13.2499f, 15.448f, 13.2499f)
                lineTo(17.0f, 13.2499f)
                curveTo(18.0016f, 13.2499f, 18.639f, 13.2535f, 19.1059f, 13.3488f)
                curveTo(19.5096f, 13.4312f, 19.7064f, 13.5659f, 19.8712f, 13.8202f)
                curveTo(20.0668f, 14.1223f, 20.095f, 14.3309f, 20.0487f, 14.5965f)
                curveTo(19.9887f, 14.9402f, 19.8078f, 15.3571f, 19.4858f, 16.0763f)
                curveTo(19.2863f, 16.5217f, 19.049f, 16.9517f, 18.7754f, 17.3611f)
                curveTo(17.8139f, 18.8001f, 16.4473f, 19.9216f, 14.8485f, 20.5838f)
                curveTo(13.2496f, 21.2461f, 11.4903f, 21.4194f, 9.793f, 21.0818f)
                curveTo(8.0956f, 20.7441f, 6.5365f, 19.9108f, 5.3128f, 18.6871f)
                curveTo(4.0891f, 17.4634f, 3.2557f, 15.9043f, 2.9181f, 14.2069f)
                curveTo(2.5805f, 12.5096f, 2.7538f, 10.7503f, 3.4161f, 9.1514f)
                curveTo(4.0783f, 7.5526f, 5.1998f, 6.186f, 6.6388f, 5.2245f)
                curveTo(7.0482f, 4.9509f, 7.4782f, 4.7136f, 7.9236f, 4.5141f)
                close()
            }
        }
        .build()
        return _pieChart2!!
    }

private var _pieChart2: ImageVector? = null
