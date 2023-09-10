package com.chiksmedina.solar.lineduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SecurityGroup

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
                pathFillType = NonZero
            ) {
                moveTo(2.6894f, 6.7046f)
                curveTo(2.5262f, 6.3238f, 2.0853f, 6.1475f, 1.7046f, 6.3106f)
                curveTo(1.3238f, 6.4738f, 1.1475f, 6.9147f, 1.3106f, 7.2954f)
                lineTo(2.6894f, 6.7046f)
                close()
                moveTo(15.5872f, 13.3287f)
                lineTo(15.3125f, 12.6308f)
                lineTo(15.3125f, 12.6308f)
                lineTo(15.5872f, 13.3287f)
                close()
                moveTo(22.6894f, 7.2954f)
                curveTo(22.8525f, 6.9147f, 22.6762f, 6.4738f, 22.2954f, 6.3106f)
                curveTo(21.9147f, 6.1475f, 21.4738f, 6.3238f, 21.3106f, 6.7046f)
                lineTo(22.6894f, 7.2954f)
                close()
                moveTo(19.0f, 11.1288f)
                lineTo(18.4867f, 10.582f)
                lineTo(18.4867f, 10.582f)
                lineTo(19.0f, 11.1288f)
                close()
                moveTo(12.0f, 13.25f)
                curveTo(8.7761f, 13.25f, 6.4613f, 11.6446f, 4.9246f, 9.9897f)
                curveTo(4.1564f, 9.1624f, 3.5933f, 8.3328f, 3.2226f, 7.7101f)
                curveTo(3.0377f, 7.3995f, 2.9019f, 7.1423f, 2.8134f, 6.9654f)
                curveTo(2.7692f, 6.877f, 2.7369f, 6.8088f, 2.7163f, 6.7641f)
                curveTo(2.706f, 6.7418f, 2.6986f, 6.7254f, 2.6941f, 6.7153f)
                curveTo(2.6919f, 6.7103f, 2.6904f, 6.7068f, 2.6896f, 6.705f)
                curveTo(2.6892f, 6.7041f, 2.689f, 6.7036f, 2.6889f, 6.7035f)
                curveTo(2.6889f, 6.7035f, 2.6889f, 6.7036f, 2.689f, 6.7037f)
                curveTo(2.689f, 6.7038f, 2.6891f, 6.704f, 2.6892f, 6.7041f)
                curveTo(2.6892f, 6.7043f, 2.6894f, 6.7046f, 2.0f, 7.0f)
                curveTo(1.3106f, 7.2954f, 1.3108f, 7.2958f, 1.3109f, 7.2961f)
                curveTo(1.311f, 7.2962f, 1.3111f, 7.2966f, 1.3113f, 7.2969f)
                curveTo(1.3115f, 7.2975f, 1.3118f, 7.2982f, 1.3122f, 7.299f)
                curveTo(1.3129f, 7.3006f, 1.3138f, 7.3027f, 1.3148f, 7.3051f)
                curveTo(1.317f, 7.31f, 1.3199f, 7.3166f, 1.3235f, 7.3248f)
                curveTo(1.3308f, 7.3412f, 1.3412f, 7.3642f, 1.3545f, 7.3931f)
                curveTo(1.3813f, 7.451f, 1.4203f, 7.5332f, 1.4718f, 7.6362f)
                curveTo(1.5747f, 7.8421f, 1.7279f, 8.1318f, 1.9337f, 8.4774f)
                curveTo(2.3442f, 9.1672f, 2.9685f, 10.0876f, 3.8254f, 11.0103f)
                curveTo(5.5387f, 12.8554f, 8.2239f, 14.75f, 12.0f, 14.75f)
                verticalLineTo(13.25f)
                close()
                moveTo(15.3125f, 12.6308f)
                curveTo(14.3421f, 13.0128f, 13.2417f, 13.25f, 12.0f, 13.25f)
                verticalLineTo(14.75f)
                curveTo(13.4382f, 14.75f, 14.7246f, 14.4742f, 15.8619f, 14.0266f)
                lineTo(15.3125f, 12.6308f)
                close()
                moveTo(22.0f, 7.0f)
                curveTo(21.3106f, 6.7046f, 21.3107f, 6.7044f, 21.3108f, 6.7043f)
                curveTo(21.3108f, 6.7042f, 21.3108f, 6.7041f, 21.3109f, 6.704f)
                curveTo(21.3109f, 6.7039f, 21.311f, 6.7038f, 21.311f, 6.7037f)
                curveTo(21.3111f, 6.7035f, 21.3111f, 6.7035f, 21.3111f, 6.7036f)
                curveTo(21.311f, 6.7038f, 21.3107f, 6.7045f, 21.3101f, 6.7058f)
                curveTo(21.309f, 6.7082f, 21.307f, 6.7127f, 21.3041f, 6.7192f)
                curveTo(21.2983f, 6.7322f, 21.2889f, 6.7531f, 21.2758f, 6.7813f)
                curveTo(21.2495f, 6.8376f, 21.2086f, 6.9229f, 21.1526f, 7.0327f)
                curveTo(21.0406f, 7.2523f, 20.869f, 7.5683f, 20.6354f, 7.9432f)
                curveTo(20.1669f, 8.6952f, 19.4563f, 9.672f, 18.4867f, 10.582f)
                lineTo(19.5133f, 11.6757f)
                curveTo(20.6023f, 10.6535f, 21.3917f, 9.5659f, 21.9085f, 8.7365f)
                curveTo(22.1676f, 8.3207f, 22.36f, 7.9668f, 22.4889f, 7.7141f)
                curveTo(22.5533f, 7.5877f, 22.602f, 7.4864f, 22.6353f, 7.4151f)
                curveTo(22.6519f, 7.3794f, 22.6647f, 7.3512f, 22.6737f, 7.331f)
                curveTo(22.6782f, 7.321f, 22.6818f, 7.3129f, 22.6844f, 7.307f)
                curveTo(22.6857f, 7.304f, 22.6867f, 7.3015f, 22.6876f, 7.2996f)
                curveTo(22.688f, 7.2986f, 22.6883f, 7.2978f, 22.6886f, 7.2971f)
                curveTo(22.6888f, 7.2968f, 22.6889f, 7.2965f, 22.689f, 7.2962f)
                curveTo(22.6891f, 7.296f, 22.6892f, 7.2958f, 22.6892f, 7.2958f)
                curveTo(22.6893f, 7.2956f, 22.6894f, 7.2954f, 22.0f, 7.0f)
                close()
                moveTo(18.4867f, 10.582f)
                curveTo(17.6277f, 11.3882f, 16.5739f, 12.1343f, 15.3125f, 12.6308f)
                lineTo(15.8619f, 14.0266f)
                curveTo(17.3355f, 13.4466f, 18.5466f, 12.583f, 19.5133f, 11.6757f)
                lineTo(18.4867f, 10.582f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.75f, 14.0001f)
                curveTo(12.75f, 13.5859f, 12.4142f, 13.2501f, 12.0f, 13.2501f)
                curveTo(11.5858f, 13.2501f, 11.25f, 13.5859f, 11.25f, 14.0001f)
                horizontalLineTo(12.75f)
                close()
                moveTo(16.2158f, 12.9197f)
                curveTo(15.9899f, 12.5725f, 15.5253f, 12.4742f, 15.1781f, 12.7001f)
                curveTo(14.831f, 12.926f, 14.7326f, 13.3906f, 14.9586f, 13.7378f)
                lineTo(16.2158f, 12.9197f)
                close()
                moveTo(9.0414f, 13.7378f)
                curveTo(9.2674f, 13.3906f, 9.169f, 12.926f, 8.8218f, 12.7001f)
                curveTo(8.4747f, 12.4742f, 8.0101f, 12.5725f, 7.7842f, 12.9197f)
                lineTo(9.0414f, 13.7378f)
                close()
                moveTo(6.3714f, 15.091f)
                curveTo(6.1455f, 15.4382f, 6.2438f, 15.9028f, 6.591f, 16.1287f)
                curveTo(6.9381f, 16.3546f, 7.4027f, 16.2563f, 7.6286f, 15.9091f)
                lineTo(6.3714f, 15.091f)
                close()
                moveTo(19.5303f, 10.5986f)
                curveTo(19.2374f, 10.3057f, 18.7626f, 10.3057f, 18.4697f, 10.5986f)
                curveTo(18.1768f, 10.8915f, 18.1768f, 11.3663f, 18.4697f, 11.6592f)
                lineTo(19.5303f, 10.5986f)
                close()
                moveTo(19.9697f, 13.1592f)
                curveTo(20.2626f, 13.4521f, 20.7374f, 13.4521f, 21.0303f, 13.1592f)
                curveTo(21.3232f, 12.8663f, 21.3232f, 12.3915f, 21.0303f, 12.0986f)
                lineTo(19.9697f, 13.1592f)
                close()
                moveTo(11.25f, 16.5001f)
                curveTo(11.25f, 16.9143f, 11.5858f, 17.2501f, 12.0f, 17.2501f)
                curveTo(12.4142f, 17.2501f, 12.75f, 16.9143f, 12.75f, 16.5001f)
                horizontalLineTo(11.25f)
                close()
                moveTo(16.3714f, 15.9091f)
                curveTo(16.5973f, 16.2563f, 17.0619f, 16.3546f, 17.409f, 16.1287f)
                curveTo(17.7562f, 15.9028f, 17.8545f, 15.4382f, 17.6286f, 15.091f)
                lineTo(16.3714f, 15.9091f)
                close()
                moveTo(5.5303f, 11.6592f)
                curveTo(5.8232f, 11.3663f, 5.8232f, 10.8915f, 5.5303f, 10.5986f)
                curveTo(5.2374f, 10.3057f, 4.7626f, 10.3057f, 4.4697f, 10.5986f)
                lineTo(5.5303f, 11.6592f)
                close()
                moveTo(2.9697f, 12.0986f)
                curveTo(2.6768f, 12.3915f, 2.6768f, 12.8663f, 2.9697f, 13.1592f)
                curveTo(3.2626f, 13.4521f, 3.7374f, 13.4521f, 4.0303f, 13.1592f)
                lineTo(2.9697f, 12.0986f)
                close()
                moveTo(7.7842f, 12.9197f)
                lineTo(6.3714f, 15.091f)
                lineTo(7.6286f, 15.9091f)
                lineTo(9.0414f, 13.7378f)
                lineTo(7.7842f, 12.9197f)
                close()
                moveTo(18.4697f, 11.6592f)
                lineTo(19.9697f, 13.1592f)
                lineTo(21.0303f, 12.0986f)
                lineTo(19.5303f, 10.5986f)
                lineTo(18.4697f, 11.6592f)
                close()
                moveTo(11.25f, 14.0001f)
                verticalLineTo(16.5001f)
                horizontalLineTo(12.75f)
                verticalLineTo(14.0001f)
                horizontalLineTo(11.25f)
                close()
                moveTo(14.9586f, 13.7378f)
                lineTo(16.3714f, 15.9091f)
                lineTo(17.6286f, 15.091f)
                lineTo(16.2158f, 12.9197f)
                lineTo(14.9586f, 13.7378f)
                close()
                moveTo(4.4697f, 10.5986f)
                lineTo(2.9697f, 12.0986f)
                lineTo(4.0303f, 13.1592f)
                lineTo(5.5303f, 11.6592f)
                lineTo(4.4697f, 10.5986f)
                close()
            }
        }
            .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
