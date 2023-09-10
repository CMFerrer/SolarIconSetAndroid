package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(
            name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.2954f, 6.3106f)
                curveTo(22.6761f, 6.4738f, 22.8525f, 6.9147f, 22.6893f, 7.2954f)
                lineTo(22.0f, 7.0f)
                curveTo(22.6893f, 7.2954f, 22.6894f, 7.2953f, 22.6893f, 7.2954f)
                lineTo(22.6886f, 7.2971f)
                lineTo(22.6875f, 7.2996f)
                lineTo(22.6843f, 7.307f)
                lineTo(22.6737f, 7.331f)
                curveTo(22.6647f, 7.3512f, 22.6519f, 7.3794f, 22.6353f, 7.4151f)
                curveTo(22.602f, 7.4864f, 22.5533f, 7.5877f, 22.4889f, 7.7141f)
                curveTo(22.36f, 7.9668f, 22.1676f, 8.3207f, 21.9085f, 8.7365f)
                curveTo(21.4829f, 9.4195f, 20.8724f, 10.2776f, 20.062f, 11.1302f)
                lineTo(21.0303f, 12.0985f)
                curveTo(21.3232f, 12.3914f, 21.3232f, 12.8663f, 21.0303f, 13.1592f)
                curveTo(20.7374f, 13.4521f, 20.2625f, 13.4521f, 19.9697f, 13.1592f)
                lineTo(18.9691f, 12.1586f)
                curveTo(18.3094f, 12.7113f, 17.5529f, 13.23f, 16.6951f, 13.6562f)
                lineTo(17.6286f, 15.091f)
                curveTo(17.8545f, 15.4381f, 17.7562f, 15.9027f, 17.409f, 16.1286f)
                curveTo(17.0618f, 16.3545f, 16.5973f, 16.2562f, 16.3713f, 15.909f)
                lineTo(15.2822f, 14.2351f)
                curveTo(14.5028f, 14.4896f, 13.659f, 14.6626f, 12.75f, 14.7246f)
                verticalLineTo(16.5f)
                curveTo(12.75f, 16.9142f, 12.4142f, 17.25f, 12.0f, 17.25f)
                curveTo(11.5858f, 17.25f, 11.25f, 16.9142f, 11.25f, 16.5f)
                verticalLineTo(14.7246f)
                curveTo(10.369f, 14.6645f, 9.5492f, 14.5002f, 8.7899f, 14.2584f)
                lineTo(7.7158f, 15.9091f)
                curveTo(7.4899f, 16.2563f, 7.0253f, 16.3546f, 6.6781f, 16.1287f)
                curveTo(6.3309f, 15.9028f, 6.2326f, 15.4382f, 6.4585f, 15.091f)
                lineTo(7.371f, 13.6888f)
                curveTo(6.5066f, 13.2666f, 5.7439f, 12.7502f, 5.0785f, 12.1983f)
                lineTo(4.1175f, 13.1592f)
                curveTo(3.8246f, 13.4521f, 3.3497f, 13.4521f, 3.0568f, 13.1592f)
                curveTo(2.764f, 12.8663f, 2.764f, 12.3915f, 3.0568f, 12.0986f)
                lineTo(3.9806f, 11.1748f)
                curveTo(3.156f, 10.3151f, 2.5353f, 9.4466f, 2.1028f, 8.7547f)
                curveTo(1.8399f, 8.334f, 1.6447f, 7.9756f, 1.5139f, 7.7197f)
                curveTo(1.4485f, 7.5916f, 1.3992f, 7.4889f, 1.3654f, 7.4166f)
                curveTo(1.3486f, 7.3805f, 1.3356f, 7.3519f, 1.3265f, 7.3315f)
                lineTo(1.3157f, 7.3071f)
                lineTo(1.3124f, 7.2996f)
                lineTo(1.3113f, 7.2971f)
                lineTo(1.311f, 7.2962f)
                curveTo(1.3109f, 7.296f, 1.3106f, 7.2954f, 2.0f, 7.0f)
                lineTo(1.311f, 7.2962f)
                curveTo(1.1478f, 6.9155f, 1.3238f, 6.4738f, 1.7046f, 6.3106f)
                curveTo(2.0849f, 6.1476f, 2.5254f, 6.3235f, 2.6889f, 6.7036f)
                curveTo(2.689f, 6.7038f, 2.6889f, 6.7035f, 2.6889f, 6.7036f)
                lineTo(2.6899f, 6.7058f)
                lineTo(2.696f, 6.7195f)
                curveTo(2.7019f, 6.7327f, 2.7115f, 6.7539f, 2.7248f, 6.7825f)
                curveTo(2.7515f, 6.8396f, 2.793f, 6.9262f, 2.8498f, 7.0375f)
                curveTo(2.9635f, 7.2601f, 3.1377f, 7.5803f, 3.3748f, 7.9596f)
                curveTo(3.8504f, 8.7205f, 4.5716f, 9.7071f, 5.5557f, 10.6216f)
                curveTo(6.4216f, 11.4263f, 7.4826f, 12.1676f, 8.7517f, 12.6558f)
                curveTo(9.7062f, 13.023f, 10.7854f, 13.25f, 12.0f, 13.25f)
                curveTo(13.2417f, 13.25f, 14.3421f, 13.0128f, 15.3125f, 12.6308f)
                curveTo(16.5739f, 12.1343f, 17.6277f, 11.3882f, 18.4867f, 10.582f)
                curveTo(19.4562f, 9.672f, 20.1669f, 8.6952f, 20.6354f, 7.9432f)
                curveTo(20.869f, 7.5683f, 21.0406f, 7.2523f, 21.1526f, 7.0327f)
                curveTo(21.2086f, 6.9229f, 21.2495f, 6.8376f, 21.2758f, 6.7812f)
                curveTo(21.2889f, 6.7531f, 21.2983f, 6.7322f, 21.3041f, 6.7192f)
                lineTo(21.3101f, 6.7057f)
                lineTo(21.3106f, 6.7045f)
                curveTo(21.3107f, 6.7045f, 21.3106f, 6.7046f, 21.3106f, 6.7045f)
                moveTo(22.2954f, 6.3106f)
                curveTo(21.9148f, 6.1475f, 21.4739f, 6.324f, 21.3106f, 6.7045f)
                close()
                moveTo(2.6889f, 6.7036f)
                curveTo(2.689f, 6.7038f, 2.6889f, 6.7035f, 2.6889f, 6.7036f)
                close()
            }
        }
            .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
