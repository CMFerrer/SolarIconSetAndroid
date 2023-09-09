package com.chiksmedina.solar.outline.security

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
import com.chiksmedina.solar.outline.SecurityGroup

public val SecurityGroup.QrCode: ImageVector
    get() {
        if (_qrCode != null) {
            return _qrCode!!
        }
        _qrCode = Builder(name = "QrCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1291f, 5.2949f)
                curveTo(5.0f, 5.4769f, 5.0f, 5.7346f, 5.0f, 6.25f)
                curveTo(5.0f, 6.7654f, 5.0f, 7.0231f, 5.1291f, 7.2051f)
                curveTo(5.1747f, 7.2693f, 5.2307f, 7.3253f, 5.2949f, 7.3709f)
                curveTo(5.4769f, 7.5f, 5.7346f, 7.5f, 6.25f, 7.5f)
                curveTo(6.7654f, 7.5f, 7.0231f, 7.5f, 7.2051f, 7.3709f)
                curveTo(7.2693f, 7.3253f, 7.3253f, 7.2693f, 7.3709f, 7.2051f)
                curveTo(7.5f, 7.0231f, 7.5f, 6.7654f, 7.5f, 6.25f)
                curveTo(7.5f, 5.7346f, 7.5f, 5.4769f, 7.3709f, 5.2949f)
                curveTo(7.3253f, 5.2307f, 7.2693f, 5.1747f, 7.2051f, 5.1291f)
                curveTo(7.0231f, 5.0f, 6.7654f, 5.0f, 6.25f, 5.0f)
                curveTo(5.7346f, 5.0f, 5.4769f, 5.0f, 5.2949f, 5.1291f)
                curveTo(5.2307f, 5.1747f, 5.1747f, 5.2307f, 5.1291f, 5.2949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.7042f, 1.2902f)
                curveTo(9.1465f, 1.3323f, 9.5588f, 1.4235f, 9.9369f, 1.6552f)
                curveTo(10.3069f, 1.882f, 10.618f, 2.1931f, 10.8448f, 2.5631f)
                curveTo(11.0765f, 2.9413f, 11.1677f, 3.3535f, 11.2098f, 3.7959f)
                curveTo(11.25f, 4.219f, 11.25f, 4.74f, 11.25f, 5.3642f)
                lineTo(11.25f, 6.552f)
                curveTo(11.25f, 7.4505f, 11.2501f, 8.1997f, 11.1701f, 8.7945f)
                curveTo(11.0857f, 9.4223f, 10.9f, 9.9891f, 10.4445f, 10.4445f)
                curveTo(9.9891f, 10.9f, 9.4223f, 11.0857f, 8.7945f, 11.1701f)
                curveTo(8.1997f, 11.2501f, 7.4505f, 11.25f, 6.552f, 11.25f)
                lineTo(5.3643f, 11.25f)
                curveTo(4.74f, 11.25f, 4.219f, 11.25f, 3.7959f, 11.2098f)
                curveTo(3.3535f, 11.1677f, 2.9413f, 11.0765f, 2.5631f, 10.8448f)
                curveTo(2.1931f, 10.618f, 1.882f, 10.3069f, 1.6552f, 9.9369f)
                curveTo(1.4235f, 9.5588f, 1.3323f, 9.1465f, 1.2902f, 8.7042f)
                curveTo(1.25f, 8.281f, 1.25f, 7.76f, 1.25f, 7.1357f)
                verticalLineTo(7.0623f)
                curveTo(1.25f, 6.1123f, 1.25f, 5.3461f, 1.3086f, 4.7293f)
                curveTo(1.3691f, 4.0932f, 1.4972f, 3.539f, 1.8026f, 3.0406f)
                curveTo(2.1118f, 2.5361f, 2.5361f, 2.1118f, 3.0406f, 1.8026f)
                curveTo(3.539f, 1.4972f, 4.0932f, 1.3691f, 4.7293f, 1.3086f)
                curveTo(5.3461f, 1.25f, 6.1123f, 1.25f, 7.0623f, 1.25f)
                horizontalLineTo(7.1357f)
                curveTo(7.76f, 1.25f, 8.281f, 1.25f, 8.7042f, 1.2902f)
                close()
                moveTo(8.5622f, 2.7835f)
                curveTo(8.2184f, 2.7508f, 7.7692f, 2.75f, 7.1f, 2.75f)
                curveTo(6.1034f, 2.75f, 5.4087f, 2.7508f, 4.8713f, 2.8019f)
                curveTo(4.345f, 2.8519f, 4.0474f, 2.9449f, 3.8244f, 3.0816f)
                curveTo(3.5216f, 3.2671f, 3.2671f, 3.5216f, 3.0816f, 3.8244f)
                curveTo(2.9449f, 4.0474f, 2.8519f, 4.345f, 2.8019f, 4.8713f)
                curveTo(2.7508f, 5.4087f, 2.75f, 6.1034f, 2.75f, 7.1f)
                curveTo(2.75f, 7.7692f, 2.7508f, 8.2184f, 2.7835f, 8.5622f)
                curveTo(2.8151f, 8.8947f, 2.8712f, 9.0503f, 2.9342f, 9.1531f)
                curveTo(3.0373f, 9.3213f, 3.1787f, 9.4627f, 3.3469f, 9.5658f)
                curveTo(3.4497f, 9.6288f, 3.6053f, 9.6849f, 3.9378f, 9.7165f)
                curveTo(4.2815f, 9.7492f, 4.7308f, 9.75f, 5.4f, 9.75f)
                horizontalLineTo(6.5f)
                curveTo(7.464f, 9.75f, 8.1116f, 9.7484f, 8.5946f, 9.6835f)
                curveTo(9.0561f, 9.6214f, 9.2536f, 9.5142f, 9.3839f, 9.3839f)
                curveTo(9.5142f, 9.2536f, 9.6214f, 9.0561f, 9.6835f, 8.5946f)
                curveTo(9.7484f, 8.1116f, 9.75f, 7.464f, 9.75f, 6.5f)
                verticalLineTo(5.4f)
                curveTo(9.75f, 4.7308f, 9.7492f, 4.2815f, 9.7165f, 3.9378f)
                curveTo(9.6849f, 3.6053f, 9.6288f, 3.4497f, 9.5658f, 3.3469f)
                curveTo(9.4627f, 3.1787f, 9.3213f, 3.0373f, 9.1531f, 2.9342f)
                curveTo(9.0503f, 2.8712f, 8.8947f, 2.8151f, 8.5622f, 2.7835f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6291f, 5.2949f)
                curveTo(16.5f, 5.4769f, 16.5f, 5.7346f, 16.5f, 6.25f)
                curveTo(16.5f, 6.7654f, 16.5f, 7.0231f, 16.6291f, 7.2051f)
                curveTo(16.6747f, 7.2693f, 16.7307f, 7.3253f, 16.7949f, 7.3709f)
                curveTo(16.9769f, 7.5f, 17.2346f, 7.5f, 17.75f, 7.5f)
                curveTo(18.2654f, 7.5f, 18.5231f, 7.5f, 18.7051f, 7.3709f)
                curveTo(18.7693f, 7.3253f, 18.8253f, 7.2693f, 18.8709f, 7.2051f)
                curveTo(19.0f, 7.0231f, 19.0f, 6.7654f, 19.0f, 6.25f)
                curveTo(19.0f, 5.7346f, 19.0f, 5.4769f, 18.8709f, 5.2949f)
                curveTo(18.8253f, 5.2307f, 18.7693f, 5.1747f, 18.7051f, 5.1291f)
                curveTo(18.5231f, 5.0f, 18.2654f, 5.0f, 17.75f, 5.0f)
                curveTo(17.2346f, 5.0f, 16.9769f, 5.0f, 16.7949f, 5.1291f)
                curveTo(16.7307f, 5.1747f, 16.6747f, 5.2307f, 16.6291f, 5.2949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.8643f, 1.25f)
                horizontalLineTo(16.9377f)
                curveTo(17.8877f, 1.25f, 18.6539f, 1.25f, 19.2707f, 1.3086f)
                curveTo(19.9068f, 1.3691f, 20.461f, 1.4972f, 20.9594f, 1.8026f)
                curveTo(21.464f, 2.1118f, 21.8882f, 2.5361f, 22.1974f, 3.0406f)
                curveTo(22.5028f, 3.539f, 22.6309f, 4.0932f, 22.6914f, 4.7293f)
                curveTo(22.75f, 5.3461f, 22.75f, 6.1123f, 22.75f, 7.0623f)
                verticalLineTo(7.1357f)
                curveTo(22.75f, 7.76f, 22.75f, 8.281f, 22.7098f, 8.7042f)
                curveTo(22.6677f, 9.1465f, 22.5765f, 9.5588f, 22.3448f, 9.9369f)
                curveTo(22.118f, 10.3069f, 21.8069f, 10.618f, 21.4369f, 10.8448f)
                curveTo(21.0588f, 11.0765f, 20.6465f, 11.1677f, 20.2042f, 11.2098f)
                curveTo(19.781f, 11.25f, 19.2601f, 11.25f, 18.6359f, 11.25f)
                lineTo(17.448f, 11.25f)
                curveTo(16.5495f, 11.25f, 15.8003f, 11.2501f, 15.2055f, 11.1701f)
                curveTo(14.5777f, 11.0857f, 14.0109f, 10.9f, 13.5555f, 10.4445f)
                curveTo(13.1f, 9.9891f, 12.9143f, 9.4223f, 12.8299f, 8.7945f)
                curveTo(12.7499f, 8.1997f, 12.75f, 7.4505f, 12.75f, 6.552f)
                verticalLineTo(5.3643f)
                curveTo(12.75f, 4.74f, 12.75f, 4.219f, 12.7902f, 3.7959f)
                curveTo(12.8323f, 3.3535f, 12.9235f, 2.9413f, 13.1552f, 2.5631f)
                curveTo(13.382f, 2.1931f, 13.6931f, 1.882f, 14.0631f, 1.6552f)
                curveTo(14.4412f, 1.4235f, 14.8535f, 1.3323f, 15.2959f, 1.2902f)
                curveTo(15.719f, 1.25f, 16.24f, 1.25f, 16.8643f, 1.25f)
                close()
                moveTo(15.4378f, 2.7835f)
                curveTo(15.1053f, 2.8151f, 14.9497f, 2.8712f, 14.8469f, 2.9342f)
                curveTo(14.6787f, 3.0373f, 14.5373f, 3.1787f, 14.4342f, 3.3469f)
                curveTo(14.3712f, 3.4497f, 14.3151f, 3.6053f, 14.2835f, 3.9378f)
                curveTo(14.2508f, 4.2815f, 14.25f, 4.7308f, 14.25f, 5.4f)
                verticalLineTo(6.5f)
                curveTo(14.25f, 7.464f, 14.2516f, 8.1116f, 14.3165f, 8.5946f)
                curveTo(14.3786f, 9.0561f, 14.4858f, 9.2536f, 14.6161f, 9.3839f)
                curveTo(14.7464f, 9.5142f, 14.9439f, 9.6214f, 15.4054f, 9.6835f)
                curveTo(15.8884f, 9.7484f, 16.536f, 9.75f, 17.5f, 9.75f)
                horizontalLineTo(18.6f)
                curveTo(19.2692f, 9.75f, 19.7184f, 9.7492f, 20.0622f, 9.7165f)
                curveTo(20.3947f, 9.6849f, 20.5503f, 9.6288f, 20.6531f, 9.5658f)
                curveTo(20.8213f, 9.4627f, 20.9627f, 9.3213f, 21.0658f, 9.1531f)
                curveTo(21.1288f, 9.0503f, 21.1849f, 8.8947f, 21.2165f, 8.5622f)
                curveTo(21.2492f, 8.2184f, 21.25f, 7.7692f, 21.25f, 7.1f)
                curveTo(21.25f, 6.1034f, 21.2492f, 5.4087f, 21.1981f, 4.8713f)
                curveTo(21.1481f, 4.345f, 21.0551f, 4.0474f, 20.9184f, 3.8244f)
                curveTo(20.7329f, 3.5216f, 20.4784f, 3.2671f, 20.1756f, 3.0816f)
                curveTo(19.9526f, 2.9449f, 19.655f, 2.8519f, 19.1288f, 2.8019f)
                curveTo(18.5913f, 2.7508f, 17.8966f, 2.75f, 16.9f, 2.75f)
                curveTo(16.2308f, 2.75f, 15.7816f, 2.7508f, 15.4378f, 2.7835f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 17.75f)
                curveTo(5.0f, 17.2346f, 5.0f, 16.9769f, 5.1291f, 16.7949f)
                curveTo(5.1747f, 16.7307f, 5.2307f, 16.6747f, 5.2949f, 16.6291f)
                curveTo(5.4769f, 16.5f, 5.7346f, 16.5f, 6.25f, 16.5f)
                curveTo(6.7654f, 16.5f, 7.0231f, 16.5f, 7.2051f, 16.6291f)
                curveTo(7.2693f, 16.6747f, 7.3253f, 16.7307f, 7.3709f, 16.7949f)
                curveTo(7.5f, 16.9769f, 7.5f, 17.2346f, 7.5f, 17.75f)
                curveTo(7.5f, 18.2654f, 7.5f, 18.5231f, 7.3709f, 18.7051f)
                curveTo(7.3253f, 18.7693f, 7.2693f, 18.8253f, 7.2051f, 18.8709f)
                curveTo(7.0231f, 19.0f, 6.7654f, 19.0f, 6.25f, 19.0f)
                curveTo(5.7346f, 19.0f, 5.4769f, 19.0f, 5.2949f, 18.8709f)
                curveTo(5.2307f, 18.8253f, 5.1747f, 18.7693f, 5.1291f, 18.7051f)
                curveTo(5.0f, 18.5231f, 5.0f, 18.2654f, 5.0f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.7945f, 12.8299f)
                curveTo(9.4223f, 12.9143f, 9.9891f, 13.1f, 10.4445f, 13.5555f)
                curveTo(10.9f, 14.0109f, 11.0857f, 14.5777f, 11.1701f, 15.2055f)
                curveTo(11.2501f, 15.8003f, 11.25f, 16.5495f, 11.25f, 17.448f)
                lineTo(11.25f, 18.6357f)
                curveTo(11.25f, 19.2599f, 11.25f, 19.781f, 11.2098f, 20.2042f)
                curveTo(11.1677f, 20.6465f, 11.0765f, 21.0588f, 10.8448f, 21.4369f)
                curveTo(10.618f, 21.8069f, 10.3069f, 22.118f, 9.9369f, 22.3448f)
                curveTo(9.5588f, 22.5765f, 9.1465f, 22.6677f, 8.7042f, 22.7098f)
                curveTo(8.281f, 22.75f, 7.76f, 22.75f, 7.1357f, 22.75f)
                horizontalLineTo(7.0623f)
                curveTo(6.1123f, 22.75f, 5.3461f, 22.75f, 4.7293f, 22.6914f)
                curveTo(4.0932f, 22.6309f, 3.539f, 22.5028f, 3.0406f, 22.1974f)
                curveTo(2.5361f, 21.8882f, 2.1118f, 21.464f, 1.8026f, 20.9594f)
                curveTo(1.4972f, 20.461f, 1.3691f, 19.9068f, 1.3086f, 19.2707f)
                curveTo(1.25f, 18.6539f, 1.25f, 17.8877f, 1.25f, 16.9377f)
                verticalLineTo(16.8643f)
                curveTo(1.25f, 16.24f, 1.25f, 15.719f, 1.2902f, 15.2959f)
                curveTo(1.3323f, 14.8535f, 1.4235f, 14.4412f, 1.6552f, 14.0631f)
                curveTo(1.882f, 13.6931f, 2.1931f, 13.382f, 2.5631f, 13.1552f)
                curveTo(2.9413f, 12.9235f, 3.3535f, 12.8323f, 3.7959f, 12.7902f)
                curveTo(4.219f, 12.75f, 4.74f, 12.75f, 5.3643f, 12.75f)
                horizontalLineTo(6.552f)
                curveTo(7.4505f, 12.75f, 8.1997f, 12.7499f, 8.7945f, 12.8299f)
                close()
                moveTo(8.5946f, 14.3165f)
                curveTo(8.1116f, 14.2516f, 7.464f, 14.25f, 6.5f, 14.25f)
                horizontalLineTo(5.4f)
                curveTo(4.7308f, 14.25f, 4.2815f, 14.2508f, 3.9378f, 14.2835f)
                curveTo(3.6053f, 14.3151f, 3.4497f, 14.3712f, 3.3469f, 14.4342f)
                curveTo(3.1787f, 14.5373f, 3.0373f, 14.6787f, 2.9342f, 14.8469f)
                curveTo(2.8712f, 14.9497f, 2.8151f, 15.1053f, 2.7835f, 15.4378f)
                curveTo(2.7508f, 15.7816f, 2.75f, 16.2308f, 2.75f, 16.9f)
                curveTo(2.75f, 17.8966f, 2.7508f, 18.5913f, 2.8019f, 19.1288f)
                curveTo(2.8519f, 19.655f, 2.9449f, 19.9526f, 3.0816f, 20.1756f)
                curveTo(3.2671f, 20.4784f, 3.5216f, 20.7329f, 3.8244f, 20.9184f)
                curveTo(4.0474f, 21.0551f, 4.345f, 21.1481f, 4.8713f, 21.1981f)
                curveTo(5.4087f, 21.2492f, 6.1034f, 21.25f, 7.1f, 21.25f)
                curveTo(7.7692f, 21.25f, 8.2184f, 21.2492f, 8.5622f, 21.2165f)
                curveTo(8.8947f, 21.1849f, 9.0503f, 21.1288f, 9.1531f, 21.0658f)
                curveTo(9.3213f, 20.9627f, 9.4627f, 20.8213f, 9.5658f, 20.6531f)
                curveTo(9.6288f, 20.5503f, 9.6849f, 20.3947f, 9.7165f, 20.0622f)
                curveTo(9.7492f, 19.7184f, 9.75f, 19.2692f, 9.75f, 18.6f)
                verticalLineTo(17.5f)
                curveTo(9.75f, 16.536f, 9.7484f, 15.8884f, 9.6835f, 15.4054f)
                curveTo(9.6214f, 14.9439f, 9.5142f, 14.7464f, 9.3839f, 14.6161f)
                curveTo(9.2536f, 14.4858f, 9.0561f, 14.3786f, 8.5946f, 14.3165f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9617f, 12.75f)
                lineTo(19.0f, 12.75f)
                verticalLineTo(14.25f)
                horizontalLineTo(17.0f)
                curveTo(16.2822f, 14.25f, 15.8002f, 14.2509f, 15.4328f, 14.2883f)
                curveTo(15.078f, 14.3244f, 14.914f, 14.3882f, 14.8055f, 14.4607f)
                curveTo(14.6691f, 14.5519f, 14.5519f, 14.6691f, 14.4607f, 14.8055f)
                curveTo(14.3882f, 14.914f, 14.3244f, 15.078f, 14.2883f, 15.4328f)
                curveTo(14.2509f, 15.8002f, 14.25f, 16.2822f, 14.25f, 17.0f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 16.9617f)
                curveTo(12.75f, 16.2921f, 12.75f, 15.7333f, 12.796f, 15.281f)
                curveTo(12.8442f, 14.8075f, 12.9489f, 14.3682f, 13.2135f, 13.9722f)
                curveTo(13.4141f, 13.6719f, 13.6719f, 13.4141f, 13.9722f, 13.2135f)
                curveTo(14.3682f, 12.9489f, 14.8075f, 12.8442f, 15.281f, 12.796f)
                curveTo(15.7333f, 12.75f, 16.2921f, 12.75f, 16.9617f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.25f)
                verticalLineTo(22.0f)
                curveTo(14.25f, 22.4142f, 13.9142f, 22.75f, 13.5f, 22.75f)
                curveTo(13.0858f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 13.5f)
                curveTo(22.75f, 13.0858f, 22.4142f, 12.75f, 22.0f, 12.75f)
                curveTo(21.5858f, 12.75f, 21.25f, 13.0858f, 21.25f, 13.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 19.0f)
                curveTo(21.25f, 19.4762f, 21.2496f, 19.7958f, 21.2327f, 20.0433f)
                curveTo(21.2163f, 20.284f, 21.1868f, 20.4012f, 21.1549f, 20.4784f)
                curveTo(21.028f, 20.7846f, 20.7846f, 21.028f, 20.4784f, 21.1549f)
                curveTo(20.4012f, 21.1868f, 20.284f, 21.2163f, 20.0433f, 21.2327f)
                curveTo(19.7958f, 21.2496f, 19.4762f, 21.25f, 19.0f, 21.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(19.0253f)
                curveTo(19.4697f, 22.75f, 19.8408f, 22.75f, 20.1454f, 22.7292f)
                curveTo(20.4625f, 22.7076f, 20.762f, 22.661f, 21.0524f, 22.5407f)
                curveTo(21.7262f, 22.2616f, 22.2616f, 21.7262f, 22.5407f, 21.0524f)
                curveTo(22.661f, 20.762f, 22.7076f, 20.4625f, 22.7292f, 20.1454f)
                curveTo(22.75f, 19.8408f, 22.75f, 19.4698f, 22.75f, 19.0253f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1685f, 16.4444f)
                curveTo(16.0f, 16.6967f, 16.0f, 17.0478f, 16.0f, 17.75f)
                curveTo(16.0f, 18.4522f, 16.0f, 18.8033f, 16.1685f, 19.0556f)
                curveTo(16.2415f, 19.1648f, 16.3352f, 19.2585f, 16.4444f, 19.3315f)
                curveTo(16.6967f, 19.5f, 17.0478f, 19.5f, 17.75f, 19.5f)
                curveTo(18.4522f, 19.5f, 18.8033f, 19.5f, 19.0556f, 19.3315f)
                curveTo(19.1648f, 19.2585f, 19.2585f, 19.1648f, 19.3315f, 19.0556f)
                curveTo(19.5f, 18.8033f, 19.5f, 18.4522f, 19.5f, 17.75f)
                curveTo(19.5f, 17.0478f, 19.5f, 16.6967f, 19.3315f, 16.4444f)
                curveTo(19.2585f, 16.3352f, 19.1648f, 16.2415f, 19.0556f, 16.1685f)
                curveTo(18.8033f, 16.0f, 18.4522f, 16.0f, 17.75f, 16.0f)
                curveTo(17.0478f, 16.0f, 16.6967f, 16.0f, 16.4444f, 16.1685f)
                curveTo(16.3352f, 16.2415f, 16.2415f, 16.3352f, 16.1685f, 16.4444f)
                close()
            }
        }
        .build()
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
