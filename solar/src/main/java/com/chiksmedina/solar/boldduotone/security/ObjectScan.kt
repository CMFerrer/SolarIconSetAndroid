package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

public val SecurityGroup.ObjectScan: ImageVector
    get() {
        if (_objectScan != null) {
            return _objectScan!!
        }
        _objectScan = Builder(name = "ObjectScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9436f, 1.25f)
                lineTo(10.0f, 1.25f)
                curveTo(10.4142f, 1.25f, 10.75f, 1.5858f, 10.75f, 2.0f)
                curveTo(10.75f, 2.4142f, 10.4142f, 2.75f, 10.0f, 2.75f)
                curveTo(8.0932f, 2.75f, 6.7385f, 2.7516f, 5.7108f, 2.8898f)
                curveTo(4.7048f, 3.025f, 4.1251f, 3.2787f, 3.7019f, 3.7019f)
                curveTo(3.2787f, 4.1251f, 3.025f, 4.7048f, 2.8898f, 5.7108f)
                curveTo(2.7516f, 6.7385f, 2.75f, 8.0932f, 2.75f, 10.0f)
                curveTo(2.75f, 10.4142f, 2.4142f, 10.75f, 2.0f, 10.75f)
                curveTo(1.5858f, 10.75f, 1.25f, 10.4142f, 1.25f, 10.0f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1058f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
                moveTo(18.2892f, 2.8898f)
                curveTo(17.2615f, 2.7516f, 15.9068f, 2.75f, 14.0f, 2.75f)
                curveTo(13.5858f, 2.75f, 13.25f, 2.4142f, 13.25f, 2.0f)
                curveTo(13.25f, 1.5858f, 13.5858f, 1.25f, 14.0f, 1.25f)
                lineTo(14.0564f, 1.25f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6614f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.1071f, 3.3896f, 22.4392f, 4.3386f, 22.5969f, 5.511f)
                curveTo(22.75f, 6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 10.4142f, 22.4142f, 10.75f, 22.0f, 10.75f)
                curveTo(21.5858f, 10.75f, 21.25f, 10.4142f, 21.25f, 10.0f)
                curveTo(21.25f, 8.0932f, 21.2484f, 6.7385f, 21.1102f, 5.7108f)
                curveTo(20.975f, 4.7048f, 20.7213f, 4.1251f, 20.2981f, 3.7019f)
                curveTo(19.8749f, 3.2787f, 19.2952f, 3.025f, 18.2892f, 2.8898f)
                close()
                moveTo(2.0f, 13.25f)
                curveTo(2.4142f, 13.25f, 2.75f, 13.5858f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                curveTo(10.4142f, 21.25f, 10.75f, 21.5858f, 10.75f, 22.0f)
                curveTo(10.75f, 22.4142f, 10.4142f, 22.75f, 10.0f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                lineTo(1.25f, 14.0f)
                curveTo(1.25f, 13.5858f, 1.5858f, 13.25f, 2.0f, 13.25f)
                close()
                moveTo(22.0f, 13.25f)
                curveTo(22.4142f, 13.25f, 22.75f, 13.5858f, 22.75f, 14.0f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 22.75f, 13.25f, 22.4142f, 13.25f, 22.0f)
                curveTo(13.25f, 21.5858f, 13.5858f, 21.25f, 14.0f, 21.25f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 13.5858f, 21.5858f, 13.25f, 22.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.5f)
                horizontalLineTo(14.0f)
                curveTo(15.8856f, 5.5f, 16.8284f, 5.5f, 17.4142f, 6.0858f)
                curveTo(17.9642f, 6.6357f, 17.9978f, 7.5004f, 17.9999f, 9.1645f)
                lineTo(18.0f, 12.0167f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 16.3856f, 18.0f, 17.3284f, 17.4142f, 17.9142f)
                curveTo(16.8284f, 18.5f, 15.8856f, 18.5f, 14.0f, 18.5f)
                horizontalLineTo(10.0f)
                curveTo(8.1144f, 18.5f, 7.1716f, 18.5f, 6.5858f, 17.9142f)
                curveTo(6.0f, 17.3284f, 6.0f, 16.3856f, 6.0f, 14.5f)
                verticalLineTo(12.0167f)
                lineTo(6.0001f, 9.1645f)
                curveTo(6.0022f, 7.5004f, 6.0358f, 6.6357f, 6.5858f, 6.0858f)
                curveTo(7.1716f, 5.5f, 8.1144f, 5.5f, 10.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3693f, 9.2999f)
                curveTo(18.2513f, 9.2545f, 18.1281f, 9.2093f, 17.9999f, 9.1644f)
                curveTo(16.1667f, 8.386f, 11.2002f, 7.2961f, 6.0001f, 9.1645f)
                curveTo(5.8719f, 9.2093f, 5.7488f, 9.2546f, 5.6308f, 9.2999f)
                curveTo(4.9385f, 9.5662f, 4.4246f, 9.8356f, 4.0767f, 10.0443f)
                curveTo(3.9027f, 10.1487f, 3.7704f, 10.2378f, 3.6781f, 10.3037f)
                curveTo(3.632f, 10.3367f, 3.5959f, 10.3638f, 3.5696f, 10.3842f)
                curveTo(3.5564f, 10.3943f, 3.5457f, 10.4028f, 3.5375f, 10.4094f)
                lineTo(3.5268f, 10.418f)
                lineTo(3.5229f, 10.4213f)
                lineTo(3.5213f, 10.4226f)
                lineTo(3.5199f, 10.4238f)
                curveTo(3.2017f, 10.689f, 3.1587f, 11.1619f, 3.4239f, 11.4801f)
                curveTo(3.6881f, 11.7971f, 4.1585f, 11.841f, 4.4767f, 11.579f)
                lineTo(4.4871f, 11.5708f)
                curveTo(4.4987f, 11.5619f, 4.5196f, 11.546f, 4.55f, 11.5243f)
                curveTo(4.6109f, 11.4808f, 4.7098f, 11.4137f, 4.8484f, 11.3306f)
                curveTo(5.1255f, 11.1643f, 5.5615f, 10.9337f, 6.1693f, 10.7f)
                curveTo(7.3829f, 10.2332f, 9.2916f, 9.75f, 12.0f, 9.75f)
                curveTo(14.7085f, 9.75f, 16.6172f, 10.2332f, 17.8308f, 10.7f)
                curveTo(18.4385f, 10.9337f, 18.8746f, 11.1643f, 19.1516f, 11.3306f)
                curveTo(19.2902f, 11.4137f, 19.3892f, 11.4808f, 19.45f, 11.5243f)
                curveTo(19.4805f, 11.546f, 19.5014f, 11.5619f, 19.5129f, 11.5708f)
                lineTo(19.5233f, 11.579f)
                curveTo(19.8415f, 11.841f, 20.312f, 11.7971f, 20.5762f, 11.4801f)
                curveTo(20.8414f, 11.1619f, 20.7984f, 10.689f, 20.4802f, 10.4238f)
                lineTo(20.0f, 10.9999f)
                curveTo(20.4802f, 10.4238f, 20.4788f, 10.4226f, 20.4788f, 10.4226f)
                lineTo(20.4771f, 10.4213f)
                lineTo(20.4732f, 10.418f)
                lineTo(20.4626f, 10.4094f)
                curveTo(20.4543f, 10.4028f, 20.4436f, 10.3943f, 20.4305f, 10.3842f)
                curveTo(20.4041f, 10.3638f, 20.368f, 10.3367f, 20.3219f, 10.3037f)
                curveTo(20.2296f, 10.2378f, 20.0973f, 10.1487f, 19.9234f, 10.0443f)
                curveTo(19.5755f, 9.8356f, 19.0615f, 9.5662f, 18.3693f, 9.2999f)
                close()
            }
        }
        .build()
        return _objectScan!!
    }

private var _objectScan: ImageVector? = null
