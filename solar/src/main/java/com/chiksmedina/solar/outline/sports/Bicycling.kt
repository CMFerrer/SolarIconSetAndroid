package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Bicycling: ImageVector
    get() {
        if (_bicycling != null) {
            return _bicycling!!
        }
        _bicycling = Builder(name = "Bicycling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.75f)
                curveTo(14.3096f, 2.75f, 13.75f, 3.3096f, 13.75f, 4.0f)
                curveTo(13.75f, 4.6904f, 14.3096f, 5.25f, 15.0f, 5.25f)
                curveTo(15.6904f, 5.25f, 16.25f, 4.6904f, 16.25f, 4.0f)
                curveTo(16.25f, 3.3096f, 15.6904f, 2.75f, 15.0f, 2.75f)
                close()
                moveTo(12.25f, 4.0f)
                curveTo(12.25f, 2.4812f, 13.4812f, 1.25f, 15.0f, 1.25f)
                curveTo(16.5188f, 1.25f, 17.75f, 2.4812f, 17.75f, 4.0f)
                curveTo(17.75f, 5.5188f, 16.5188f, 6.75f, 15.0f, 6.75f)
                curveTo(13.4812f, 6.75f, 12.25f, 5.5188f, 12.25f, 4.0f)
                close()
                moveTo(12.161f, 7.1149f)
                curveTo(12.1727f, 7.1266f, 12.1845f, 7.1382f, 12.1963f, 7.15f)
                lineTo(12.7736f, 7.7238f)
                curveTo(13.6829f, 8.6274f, 13.9992f, 8.9233f, 14.3794f, 9.0801f)
                curveTo(14.7595f, 9.2368f, 15.1925f, 9.25f, 16.4744f, 9.25f)
                horizontalLineTo(18.5f)
                curveTo(18.9142f, 9.25f, 19.25f, 9.5858f, 19.25f, 10.0f)
                curveTo(19.25f, 10.4142f, 18.9142f, 10.75f, 18.5f, 10.75f)
                horizontalLineTo(16.4744f)
                curveTo(16.4265f, 10.75f, 16.3792f, 10.75f, 16.3324f, 10.75f)
                curveTo(15.2493f, 10.7506f, 14.4965f, 10.7509f, 13.8075f, 10.4668f)
                curveTo(13.1185f, 10.1826f, 12.5848f, 9.6517f, 11.8169f, 8.8878f)
                curveTo(11.7838f, 8.8549f, 11.7502f, 8.8215f, 11.7162f, 8.7877f)
                lineTo(11.1389f, 8.2139f)
                curveTo(10.7302f, 7.8077f, 10.4796f, 7.5613f, 10.2782f, 7.411f)
                curveTo(10.1848f, 7.3413f, 10.1308f, 7.3151f, 10.1052f, 7.3055f)
                curveTo(10.0999f, 7.3035f, 10.0961f, 7.3024f, 10.0938f, 7.3018f)
                curveTo(10.0917f, 7.3028f, 10.0882f, 7.3046f, 10.0833f, 7.3075f)
                curveTo(10.0599f, 7.3215f, 10.0115f, 7.3571f, 9.9323f, 7.4425f)
                curveTo(9.7613f, 7.6267f, 9.5594f, 7.9144f, 9.2309f, 8.3878f)
                lineTo(8.0042f, 10.155f)
                curveTo(7.6698f, 10.6368f, 7.4668f, 10.9325f, 7.352f, 11.1615f)
                curveTo(7.2987f, 11.2678f, 7.2821f, 11.3267f, 7.2772f, 11.3541f)
                curveTo(7.2762f, 11.3594f, 7.2758f, 11.3631f, 7.2756f, 11.3656f)
                curveTo(7.277f, 11.3675f, 7.2794f, 11.3705f, 7.283f, 11.3745f)
                curveTo(7.3016f, 11.3952f, 7.3466f, 11.4366f, 7.4478f, 11.4991f)
                curveTo(7.6657f, 11.6338f, 7.9937f, 11.7789f, 8.5312f, 12.0135f)
                lineTo(10.0471f, 12.6749f)
                curveTo(10.6948f, 12.9575f, 11.2408f, 13.1957f, 11.6615f, 13.4422f)
                curveTo(12.1082f, 13.7038f, 12.4856f, 14.0143f, 12.739f, 14.4775f)
                curveTo(12.9924f, 14.9407f, 13.0502f, 15.4259f, 13.0295f, 15.9432f)
                curveTo(13.0101f, 16.4304f, 12.9162f, 17.0186f, 12.8048f, 17.7165f)
                lineTo(12.7406f, 18.1182f)
                curveTo(12.6753f, 18.5273f, 12.2908f, 18.8059f, 11.8818f, 18.7406f)
                curveTo(11.4727f, 18.6753f, 11.1941f, 18.2908f, 11.2594f, 17.8818f)
                lineTo(11.3166f, 17.5233f)
                curveTo(11.4368f, 16.7706f, 11.5153f, 16.271f, 11.5307f, 15.8835f)
                curveTo(11.5454f, 15.516f, 11.4978f, 15.334f, 11.423f, 15.1973f)
                curveTo(11.3483f, 15.0606f, 11.2206f, 14.9223f, 10.9033f, 14.7364f)
                curveTo(10.5687f, 14.5404f, 10.1056f, 14.337f, 9.407f, 14.0322f)
                lineTo(7.8852f, 13.3682f)
                curveTo(7.4086f, 13.1603f, 6.9796f, 12.9731f, 6.6593f, 12.7752f)
                curveTo(6.3112f, 12.5601f, 5.9696f, 12.2603f, 5.8319f, 11.7749f)
                curveTo(5.6943f, 11.2895f, 5.8277f, 10.8551f, 6.0111f, 10.4893f)
                curveTo(6.1798f, 10.1527f, 6.4468f, 9.7682f, 6.7433f, 9.3411f)
                curveTo(6.7528f, 9.3273f, 6.7624f, 9.3135f, 6.772f, 9.2997f)
                lineTo(7.9986f, 7.5325f)
                curveTo(8.0081f, 7.5188f, 8.0175f, 7.5052f, 8.0269f, 7.4916f)
                curveTo(8.3179f, 7.0723f, 8.5804f, 6.6941f, 8.8328f, 6.4221f)
                curveTo(9.1076f, 6.126f, 9.4623f, 5.8526f, 9.9577f, 5.8075f)
                curveTo(10.453f, 5.7623f, 10.8513f, 5.9671f, 11.1751f, 6.2087f)
                curveTo(11.4725f, 6.4306f, 11.799f, 6.7551f, 12.161f, 7.1149f)
                close()
                moveTo(6.0f, 15.75f)
                curveTo(4.7574f, 15.75f, 3.75f, 16.7574f, 3.75f, 18.0f)
                curveTo(3.75f, 19.2426f, 4.7574f, 20.25f, 6.0f, 20.25f)
                curveTo(7.2426f, 20.25f, 8.25f, 19.2426f, 8.25f, 18.0f)
                curveTo(8.25f, 16.7574f, 7.2426f, 15.75f, 6.0f, 15.75f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 15.9289f, 3.9289f, 14.25f, 6.0f, 14.25f)
                curveTo(8.0711f, 14.25f, 9.75f, 15.9289f, 9.75f, 18.0f)
                curveTo(9.75f, 20.0711f, 8.0711f, 21.75f, 6.0f, 21.75f)
                curveTo(3.9289f, 21.75f, 2.25f, 20.0711f, 2.25f, 18.0f)
                close()
                moveTo(18.0f, 15.75f)
                curveTo(16.7574f, 15.75f, 15.75f, 16.7574f, 15.75f, 18.0f)
                curveTo(15.75f, 19.2426f, 16.7574f, 20.25f, 18.0f, 20.25f)
                curveTo(19.2426f, 20.25f, 20.25f, 19.2426f, 20.25f, 18.0f)
                curveTo(20.25f, 16.7574f, 19.2426f, 15.75f, 18.0f, 15.75f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 15.9289f, 15.9289f, 14.25f, 18.0f, 14.25f)
                curveTo(20.0711f, 14.25f, 21.75f, 15.9289f, 21.75f, 18.0f)
                curveTo(21.75f, 20.0711f, 20.0711f, 21.75f, 18.0f, 21.75f)
                curveTo(15.9289f, 21.75f, 14.25f, 20.0711f, 14.25f, 18.0f)
                close()
            }
        }
        .build()
        return _bicycling!!
    }

private var _bicycling: ImageVector? = null
