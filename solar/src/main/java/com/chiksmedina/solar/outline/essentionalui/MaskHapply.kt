package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.MaskHapply: ImageVector
    get() {
        if (_maskHapply != null) {
            return _maskHapply!!
        }
        _maskHapply = Builder(name = "MaskHapply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1709f, 9.3352f)
                curveTo(7.2944f, 9.0881f, 7.7568f, 8.75f, 8.5f, 8.75f)
                curveTo(9.2432f, 8.75f, 9.7056f, 9.0881f, 9.8291f, 9.3352f)
                curveTo(10.0142f, 9.7058f, 10.4647f, 9.856f, 10.8352f, 9.6709f)
                curveTo(11.2058f, 9.4857f, 11.3561f, 9.0352f, 11.1709f, 8.6647f)
                curveTo(10.7121f, 7.7466f, 9.6035f, 7.25f, 8.5f, 7.25f)
                curveTo(7.3965f, 7.25f, 6.2879f, 7.7466f, 5.8291f, 8.6647f)
                curveTo(5.6439f, 9.0352f, 5.7942f, 9.4857f, 6.1648f, 9.6709f)
                curveTo(6.5353f, 9.856f, 6.9858f, 9.7058f, 7.1709f, 9.3352f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 8.75f)
                curveTo(14.7568f, 8.75f, 14.2944f, 9.0881f, 14.1709f, 9.3352f)
                curveTo(13.9857f, 9.7058f, 13.5353f, 9.856f, 13.1647f, 9.6709f)
                curveTo(12.7942f, 9.4857f, 12.6439f, 9.0352f, 12.8291f, 8.6647f)
                curveTo(13.2879f, 7.7466f, 14.3965f, 7.25f, 15.5f, 7.25f)
                curveTo(16.6035f, 7.25f, 17.7121f, 7.7466f, 18.1709f, 8.6647f)
                curveTo(18.3561f, 9.0352f, 18.2058f, 9.4857f, 17.8352f, 9.6709f)
                curveTo(17.4647f, 9.856f, 17.0142f, 9.7058f, 16.8291f, 9.3352f)
                curveTo(16.7056f, 9.0881f, 16.2432f, 8.75f, 15.5f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.8353f, 2.2122f)
                lineTo(7.7248f, 2.0271f)
                curveTo(6.6916f, 1.8549f, 5.8373f, 1.7125f, 5.155f, 1.696f)
                curveTo(4.4394f, 1.6787f, 3.776f, 1.7937f, 3.2225f, 2.2626f)
                curveTo(2.6691f, 2.7314f, 2.4465f, 3.3665f, 2.3459f, 4.0749f)
                curveTo(2.2499f, 4.7501f, 2.25f, 5.6155f, 2.25f, 6.6619f)
                lineTo(2.25f, 12.0f)
                curveTo(2.25f, 17.9642f, 6.8737f, 20.8143f, 9.605f, 21.9762f)
                lineTo(9.6316f, 21.9875f)
                curveTo(9.9718f, 22.1323f, 10.2904f, 22.2678f, 10.6562f, 22.359f)
                curveTo(11.0418f, 22.4551f, 11.4518f, 22.4964f, 12.0f, 22.4964f)
                curveTo(12.5482f, 22.4964f, 12.9582f, 22.4551f, 13.3438f, 22.359f)
                curveTo(13.7096f, 22.2678f, 14.0282f, 22.1323f, 14.3684f, 21.9875f)
                lineTo(14.395f, 21.9762f)
                curveTo(17.1263f, 20.8143f, 21.75f, 17.9642f, 21.75f, 12.0f)
                verticalLineTo(6.6619f)
                curveTo(21.75f, 5.6155f, 21.7501f, 4.7501f, 21.6541f, 4.0749f)
                curveTo(21.5535f, 3.3665f, 21.3309f, 2.7314f, 20.7775f, 2.2626f)
                curveTo(20.224f, 1.7937f, 19.5606f, 1.6787f, 18.845f, 1.696f)
                curveTo(18.1627f, 1.7125f, 17.3084f, 1.8549f, 16.2753f, 2.0271f)
                lineTo(15.1647f, 2.2122f)
                curveTo(13.5012f, 2.4894f, 12.7514f, 2.6121f, 12.0f, 2.6121f)
                curveTo(11.2486f, 2.6121f, 10.4988f, 2.4894f, 8.8353f, 2.2122f)
                close()
                moveTo(4.192f, 3.4071f)
                curveTo(4.3458f, 3.2769f, 4.5765f, 3.1824f, 5.1188f, 3.1955f)
                curveTo(5.682f, 3.2091f, 6.4307f, 3.3321f, 7.5343f, 3.5161f)
                lineTo(8.6623f, 3.704f)
                curveTo(10.2329f, 3.9659f, 11.11f, 4.1121f, 12.0f, 4.1121f)
                curveTo(12.89f, 4.1121f, 13.7671f, 3.9659f, 15.3377f, 3.704f)
                lineTo(16.4657f, 3.516f)
                curveTo(17.5693f, 3.3321f, 18.318f, 3.2091f, 18.8813f, 3.1955f)
                curveTo(19.4235f, 3.1824f, 19.6542f, 3.2769f, 19.808f, 3.4071f)
                curveTo(19.9618f, 3.5375f, 20.0929f, 3.7494f, 20.1691f, 4.2858f)
                curveTo(20.2482f, 4.8431f, 20.25f, 5.601f, 20.25f, 6.7189f)
                verticalLineTo(12.0f)
                curveTo(20.25f, 17.0165f, 16.3958f, 19.495f, 13.8079f, 20.5959f)
                curveTo(13.4367f, 20.7538f, 13.2212f, 20.8437f, 12.981f, 20.9035f)
                curveTo(12.7511f, 20.9608f, 12.4711f, 20.9964f, 12.0f, 20.9964f)
                curveTo(11.5289f, 20.9964f, 11.2489f, 20.9608f, 11.019f, 20.9035f)
                curveTo(10.7788f, 20.8437f, 10.5633f, 20.7538f, 10.1921f, 20.5959f)
                curveTo(7.6042f, 19.495f, 3.75f, 17.0165f, 3.75f, 12.0f)
                verticalLineTo(6.7189f)
                curveTo(3.75f, 5.601f, 3.7518f, 4.8431f, 3.831f, 4.2858f)
                curveTo(3.9072f, 3.7494f, 4.0382f, 3.5375f, 4.192f, 3.4071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9569f, 13.4827f)
                curveTo(7.6712f, 13.7827f, 7.6855f, 14.2599f, 7.9854f, 14.5456f)
                lineTo(8.0158f, 14.5732f)
                curveTo(8.0312f, 14.5869f, 8.0511f, 14.6039f, 8.0756f, 14.6239f)
                curveTo(8.1246f, 14.6639f, 8.1919f, 14.7156f, 8.2782f, 14.7748f)
                curveTo(8.4509f, 14.8932f, 8.6995f, 15.0415f, 9.0295f, 15.1866f)
                curveTo(9.6919f, 15.4778f, 10.6696f, 15.75f, 12.0f, 15.75f)
                curveTo(13.3304f, 15.75f, 14.3081f, 15.4778f, 14.9706f, 15.1866f)
                curveTo(15.3005f, 15.0415f, 15.5491f, 14.8932f, 15.7218f, 14.7748f)
                curveTo(15.8081f, 14.7156f, 15.8754f, 14.6639f, 15.9244f, 14.6239f)
                curveTo(15.9489f, 14.6039f, 15.9688f, 14.5869f, 15.9842f, 14.5732f)
                lineTo(16.0041f, 14.5554f)
                lineTo(16.0115f, 14.5485f)
                lineTo(16.0146f, 14.5456f)
                lineTo(16.016f, 14.5443f)
                lineTo(16.0172f, 14.5431f)
                curveTo(16.3172f, 14.2574f, 16.3288f, 13.7827f, 16.0431f, 13.4827f)
                curveTo(15.76f, 13.1855f, 15.2913f, 13.1714f, 14.991f, 13.4492f)
                lineTo(14.9902f, 13.4498f)
                lineTo(14.9854f, 13.454f)
                lineTo(14.9758f, 13.4619f)
                curveTo(14.9578f, 13.4766f, 14.9239f, 13.5031f, 14.8735f, 13.5377f)
                curveTo(14.7728f, 13.6067f, 14.6058f, 13.7084f, 14.367f, 13.8134f)
                curveTo(13.8919f, 14.0222f, 13.1196f, 14.25f, 12.0f, 14.25f)
                curveTo(10.8804f, 14.25f, 10.1081f, 14.0222f, 9.633f, 13.8134f)
                curveTo(9.3942f, 13.7084f, 9.2272f, 13.6067f, 9.1265f, 13.5377f)
                curveTo(9.0907f, 13.5132f, 9.0633f, 13.4927f, 9.0439f, 13.4776f)
                curveTo(9.036f, 13.4715f, 9.0294f, 13.4662f, 9.0242f, 13.4619f)
                curveTo(9.0165f, 13.4557f, 9.0117f, 13.4515f, 9.0098f, 13.4498f)
                curveTo(8.7095f, 13.1714f, 8.2402f, 13.1853f, 7.9569f, 13.4827f)
                close()
            }
        }
        .build()
        return _maskHapply!!
    }

private var _maskHapply: ImageVector? = null
