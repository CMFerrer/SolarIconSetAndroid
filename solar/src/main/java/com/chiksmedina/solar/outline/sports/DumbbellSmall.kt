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

public val SportsGroup.DumbbellSmall: ImageVector
    get() {
        if (_dumbbellSmall != null) {
            return _dumbbellSmall!!
        }
        _dumbbellSmall = Builder(name = "DumbbellSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.4161f, 6.2501f)
                curveTo(17.4438f, 6.2501f, 17.4718f, 6.2501f, 17.5f, 6.2501f)
                curveTo(17.5282f, 6.2501f, 17.5562f, 6.2501f, 17.5839f, 6.2501f)
                curveTo(17.9647f, 6.2497f, 18.2932f, 6.2493f, 18.5823f, 6.3268f)
                curveTo(19.3588f, 6.5348f, 19.9653f, 7.1413f, 20.1733f, 7.9178f)
                lineTo(19.4714f, 8.1059f)
                lineTo(20.1733f, 7.9178f)
                curveTo(20.2508f, 8.2069f, 20.2505f, 8.5354f, 20.2501f, 8.9162f)
                curveTo(20.25f, 8.9439f, 20.25f, 8.9719f, 20.25f, 9.0001f)
                verticalLineTo(9.2613f)
                curveTo(21.6516f, 9.3876f, 22.75f, 10.5656f, 22.75f, 12.0001f)
                curveTo(22.75f, 13.4346f, 21.6516f, 14.6126f, 20.25f, 14.7389f)
                verticalLineTo(15.0001f)
                curveTo(20.25f, 15.0284f, 20.25f, 15.0563f, 20.2501f, 15.084f)
                curveTo(20.2505f, 15.4648f, 20.2508f, 15.7933f, 20.1733f, 16.0825f)
                curveTo(19.9653f, 16.8589f, 19.3588f, 17.4654f, 18.5823f, 17.6735f)
                curveTo(18.2932f, 17.7509f, 17.9647f, 17.7506f, 17.5839f, 17.7502f)
                curveTo(17.5562f, 17.7501f, 17.5282f, 17.7501f, 17.5f, 17.7501f)
                curveTo(17.4718f, 17.7501f, 17.4438f, 17.7501f, 17.4161f, 17.7502f)
                curveTo(17.0353f, 17.7506f, 16.7068f, 17.7509f, 16.4177f, 17.6735f)
                curveTo(15.6412f, 17.4654f, 15.0347f, 16.8589f, 14.8267f, 16.0825f)
                curveTo(14.7492f, 15.7933f, 14.7495f, 15.4648f, 14.7499f, 15.084f)
                curveTo(14.75f, 15.0563f, 14.75f, 15.0284f, 14.75f, 15.0001f)
                verticalLineTo(12.7501f)
                horizontalLineTo(9.25f)
                verticalLineTo(15.0001f)
                curveTo(9.25f, 15.0284f, 9.25f, 15.0563f, 9.2501f, 15.084f)
                curveTo(9.2505f, 15.4648f, 9.2508f, 15.7933f, 9.1733f, 16.0825f)
                curveTo(8.9653f, 16.8589f, 8.3588f, 17.4654f, 7.5823f, 17.6735f)
                curveTo(7.2932f, 17.7509f, 6.9647f, 17.7506f, 6.5839f, 17.7502f)
                curveTo(6.5562f, 17.7501f, 6.5282f, 17.7501f, 6.5f, 17.7501f)
                curveTo(6.4718f, 17.7501f, 6.4438f, 17.7501f, 6.4161f, 17.7502f)
                curveTo(6.0353f, 17.7506f, 5.7068f, 17.7509f, 5.4177f, 17.6735f)
                curveTo(4.6412f, 17.4654f, 4.0347f, 16.8589f, 3.8267f, 16.0825f)
                curveTo(3.7492f, 15.7933f, 3.7495f, 15.4648f, 3.7499f, 15.084f)
                curveTo(3.75f, 15.0563f, 3.75f, 15.0284f, 3.75f, 15.0001f)
                verticalLineTo(14.7389f)
                curveTo(2.3484f, 14.6126f, 1.25f, 13.4346f, 1.25f, 12.0001f)
                curveTo(1.25f, 10.5656f, 2.3484f, 9.3876f, 3.75f, 9.2613f)
                verticalLineTo(9.0001f)
                curveTo(3.75f, 8.9719f, 3.75f, 8.9439f, 3.7499f, 8.9162f)
                curveTo(3.7495f, 8.5354f, 3.7492f, 8.2069f, 3.8267f, 7.9178f)
                curveTo(4.0347f, 7.1413f, 4.6412f, 6.5348f, 5.4177f, 6.3268f)
                curveTo(5.7068f, 6.2493f, 6.0353f, 6.2497f, 6.4161f, 6.2501f)
                curveTo(6.4438f, 6.2501f, 6.4718f, 6.2501f, 6.5f, 6.2501f)
                curveTo(6.5282f, 6.2501f, 6.5562f, 6.2501f, 6.5839f, 6.2501f)
                curveTo(6.9647f, 6.2497f, 7.2932f, 6.2493f, 7.5823f, 6.3268f)
                curveTo(8.3588f, 6.5348f, 8.9653f, 7.1413f, 9.1733f, 7.9178f)
                curveTo(9.2508f, 8.2069f, 9.2505f, 8.5354f, 9.2501f, 8.9162f)
                curveTo(9.25f, 8.9439f, 9.25f, 8.9719f, 9.25f, 9.0001f)
                verticalLineTo(11.2501f)
                horizontalLineTo(14.75f)
                verticalLineTo(9.0001f)
                curveTo(14.75f, 8.9719f, 14.75f, 8.9439f, 14.7499f, 8.9162f)
                curveTo(14.7495f, 8.5354f, 14.7492f, 8.2069f, 14.8267f, 7.9178f)
                curveTo(15.0347f, 7.1413f, 15.6412f, 6.5348f, 16.4177f, 6.3268f)
                curveTo(16.7068f, 6.2493f, 17.0353f, 6.2497f, 17.4161f, 6.2501f)
                close()
                moveTo(3.75f, 10.7751f)
                curveTo(3.1794f, 10.8909f, 2.75f, 11.3954f, 2.75f, 12.0001f)
                curveTo(2.75f, 12.6049f, 3.1794f, 13.1093f, 3.75f, 13.2251f)
                verticalLineTo(10.7751f)
                close()
                moveTo(20.25f, 13.2251f)
                curveTo(20.8206f, 13.1093f, 21.25f, 12.6049f, 21.25f, 12.0001f)
                curveTo(21.25f, 11.3954f, 20.8206f, 10.8909f, 20.25f, 10.7751f)
                verticalLineTo(13.2251f)
                close()
                moveTo(17.5f, 7.7501f)
                curveTo(16.9867f, 7.7501f, 16.8772f, 7.7566f, 16.8059f, 7.7757f)
                curveTo(16.5471f, 7.845f, 16.3449f, 8.0472f, 16.2756f, 8.306f)
                lineTo(15.5511f, 8.1119f)
                lineTo(16.2756f, 8.306f)
                curveTo(16.2564f, 8.3773f, 16.25f, 8.4868f, 16.25f, 9.0001f)
                verticalLineTo(15.0001f)
                curveTo(16.25f, 15.5134f, 16.2564f, 15.6229f, 16.2756f, 15.6942f)
                curveTo(16.3449f, 15.9531f, 16.5471f, 16.1552f, 16.8059f, 16.2246f)
                curveTo(16.8772f, 16.2437f, 16.9867f, 16.2501f, 17.5f, 16.2501f)
                curveTo(18.0133f, 16.2501f, 18.1228f, 16.2437f, 18.1941f, 16.2246f)
                curveTo(18.4529f, 16.1552f, 18.6551f, 15.9531f, 18.7244f, 15.6942f)
                curveTo(18.7436f, 15.6229f, 18.75f, 15.5134f, 18.75f, 15.0001f)
                verticalLineTo(9.0001f)
                curveTo(18.75f, 8.4868f, 18.7436f, 8.3773f, 18.7244f, 8.306f)
                curveTo(18.6551f, 8.0472f, 18.4529f, 7.845f, 18.1941f, 7.7757f)
                curveTo(18.1228f, 7.7566f, 18.0133f, 7.7501f, 17.5f, 7.7501f)
                close()
                moveTo(6.5f, 7.7501f)
                curveTo(5.9867f, 7.7501f, 5.8772f, 7.7566f, 5.8059f, 7.7757f)
                curveTo(5.5471f, 7.845f, 5.3449f, 8.0472f, 5.2756f, 8.306f)
                lineTo(5.2756f, 8.306f)
                curveTo(5.2564f, 8.3773f, 5.25f, 8.4868f, 5.25f, 9.0001f)
                lineTo(5.25f, 15.0001f)
                curveTo(5.25f, 15.5134f, 5.2564f, 15.6229f, 5.2756f, 15.6942f)
                curveTo(5.3449f, 15.9531f, 5.5471f, 16.1552f, 5.8059f, 16.2246f)
                lineTo(5.6118f, 16.949f)
                lineTo(5.8059f, 16.2246f)
                curveTo(5.8772f, 16.2437f, 5.9867f, 16.2501f, 6.5f, 16.2501f)
                curveTo(7.0133f, 16.2501f, 7.1228f, 16.2437f, 7.1941f, 16.2246f)
                lineTo(7.3882f, 16.949f)
                lineTo(7.1941f, 16.2246f)
                curveTo(7.4529f, 16.1552f, 7.6551f, 15.9531f, 7.7244f, 15.6942f)
                curveTo(7.7436f, 15.6229f, 7.75f, 15.5134f, 7.75f, 15.0001f)
                verticalLineTo(9.0001f)
                curveTo(7.75f, 8.4868f, 7.7436f, 8.3773f, 7.7244f, 8.306f)
                curveTo(7.6551f, 8.0472f, 7.4529f, 7.845f, 7.1941f, 7.7757f)
                curveTo(7.1228f, 7.7566f, 7.0133f, 7.7501f, 6.5f, 7.7501f)
                close()
            }
        }
        .build()
        return _dumbbellSmall!!
    }

private var _dumbbellSmall: ImageVector? = null
