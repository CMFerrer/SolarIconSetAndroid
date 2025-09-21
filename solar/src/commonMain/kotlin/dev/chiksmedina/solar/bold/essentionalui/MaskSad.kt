package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.MaskSad: ImageVector
    get() {
        if (_maskSad != null) {
            return _maskSad!!
        }
        _maskSad = Builder(
            name = "MaskSad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.0f, 11.4061f)
                verticalLineTo(6.2077f)
                curveTo(21.0f, 4.052f, 21.0f, 2.9742f, 20.2927f, 2.3844f)
                curveTo(19.5855f, 1.7947f, 18.5045f, 1.972f, 16.3424f, 2.3267f)
                lineTo(15.288f, 2.4997f)
                curveTo(13.6477f, 2.7688f, 12.8276f, 2.9034f, 12.0f, 2.9034f)
                curveTo(11.1724f, 2.9034f, 10.3523f, 2.7688f, 8.712f, 2.4997f)
                lineTo(7.6576f, 2.3267f)
                curveTo(5.4955f, 1.972f, 4.4145f, 1.7947f, 3.7073f, 2.3844f)
                curveTo(3.0f, 2.9742f, 3.0f, 4.052f, 3.0f, 6.2077f)
                verticalLineTo(11.4061f)
                curveTo(3.0f, 16.8106f, 7.239f, 19.4332f, 9.8986f, 20.5469f)
                curveTo(10.62f, 20.849f, 10.9807f, 21.0f, 12.0f, 21.0f)
                curveTo(13.0193f, 21.0f, 13.38f, 20.849f, 14.1014f, 20.5469f)
                curveTo(16.761f, 19.4332f, 21.0f, 16.8106f, 21.0f, 11.4061f)
                close()
                moveTo(7.9959f, 13.8125f)
                curveTo(7.696f, 14.0937f, 7.6712f, 14.5731f, 7.9569f, 14.8683f)
                curveTo(8.2402f, 15.1612f, 8.7095f, 15.1748f, 9.0098f, 14.9007f)
                lineTo(9.0153f, 14.896f)
                lineTo(9.0242f, 14.8888f)
                curveTo(9.0294f, 14.8846f, 9.0359f, 14.8795f, 9.0438f, 14.8734f)
                curveTo(9.0632f, 14.8586f, 9.0907f, 14.8384f, 9.1265f, 14.8143f)
                curveTo(9.2272f, 14.7463f, 9.3942f, 14.6462f, 9.633f, 14.5429f)
                curveTo(10.1081f, 14.3373f, 10.8804f, 14.1131f, 12.0f, 14.1131f)
                curveTo(13.1196f, 14.1131f, 13.8919f, 14.3373f, 14.367f, 14.5429f)
                curveTo(14.6058f, 14.6462f, 14.7728f, 14.7463f, 14.8735f, 14.8143f)
                curveTo(14.9239f, 14.8483f, 14.9578f, 14.8743f, 14.9758f, 14.8888f)
                lineTo(14.9862f, 14.8973f)
                lineTo(14.9909f, 14.9014f)
                curveTo(15.2913f, 15.1748f, 15.76f, 15.1609f, 16.0431f, 14.8683f)
                curveTo(16.3288f, 14.5731f, 16.3172f, 14.1058f, 16.0172f, 13.8246f)
                lineTo(16.016f, 13.8234f)
                lineTo(16.0146f, 13.8221f)
                lineTo(16.0115f, 13.8192f)
                lineTo(16.0041f, 13.8125f)
                lineTo(15.9842f, 13.7949f)
                curveTo(15.9688f, 13.7815f, 15.9489f, 13.7647f, 15.9244f, 13.745f)
                curveTo(15.8754f, 13.7056f, 15.8081f, 13.6548f, 15.7218f, 13.5965f)
                curveTo(15.5491f, 13.4799f, 15.3005f, 13.3339f, 14.9706f, 13.1912f)
                curveTo(14.3081f, 12.9045f, 13.3304f, 12.6366f, 12.0f, 12.6366f)
                curveTo(10.6696f, 12.6366f, 9.6919f, 12.9045f, 9.0295f, 13.1912f)
                curveTo(8.6995f, 13.3339f, 8.4509f, 13.4799f, 8.2782f, 13.5965f)
                curveTo(8.1919f, 13.6548f, 8.1246f, 13.7056f, 8.0756f, 13.745f)
                curveTo(8.0511f, 13.7647f, 8.0312f, 13.7815f, 8.0158f, 13.7949f)
                lineTo(7.9959f, 13.8125f)
                close()
                moveTo(8.5002f, 8.207f)
                curveTo(7.7569f, 8.207f, 7.2945f, 8.5399f, 7.1711f, 8.7831f)
                curveTo(6.9859f, 9.1478f, 6.5354f, 9.2957f, 6.1649f, 9.1135f)
                curveTo(5.7944f, 8.9312f, 5.6441f, 8.4878f, 5.8293f, 8.1231f)
                curveTo(6.288f, 7.2193f, 7.3967f, 6.7305f, 8.5002f, 6.7305f)
                curveTo(9.6037f, 6.7305f, 10.7123f, 7.2193f, 11.1711f, 8.1231f)
                curveTo(11.3562f, 8.4878f, 11.2059f, 8.9312f, 10.8354f, 9.1135f)
                curveTo(10.4649f, 9.2957f, 10.0144f, 9.1478f, 9.8293f, 8.7831f)
                curveTo(9.7058f, 8.5399f, 9.2434f, 8.207f, 8.5002f, 8.207f)
                close()
                moveTo(15.5002f, 8.207f)
                curveTo(14.7569f, 8.207f, 14.2945f, 8.5399f, 14.1711f, 8.7831f)
                curveTo(13.9859f, 9.1478f, 13.5354f, 9.2957f, 13.1649f, 9.1135f)
                curveTo(12.7944f, 8.9312f, 12.6441f, 8.4878f, 12.8293f, 8.1231f)
                curveTo(13.288f, 7.2193f, 14.3967f, 6.7305f, 15.5002f, 6.7305f)
                curveTo(16.6037f, 6.7305f, 17.7123f, 7.2193f, 18.1711f, 8.1231f)
                curveTo(18.3562f, 8.4878f, 18.2059f, 8.9312f, 17.8354f, 9.1135f)
                curveTo(17.4649f, 9.2957f, 17.0144f, 9.1478f, 16.8293f, 8.7831f)
                curveTo(16.7058f, 8.5399f, 16.2434f, 8.207f, 15.5002f, 8.207f)
                close()
            }
        }
            .build()
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
