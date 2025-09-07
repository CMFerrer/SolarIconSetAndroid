package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.CaseMinimalistic: ImageVector
    get() {
        if (_caseMinimalistic != null) {
            return _caseMinimalistic!!
        }
        _caseMinimalistic = Builder(
            name = "CaseMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.561f, 2.25f)
                horizontalLineTo(13.4395f)
                curveTo(13.553f, 2.25f, 13.6414f, 2.25f, 13.725f, 2.255f)
                curveTo(14.7854f, 2.3193f, 15.714f, 2.9885f, 16.1102f, 3.9743f)
                curveTo(16.1415f, 4.0519f, 16.1694f, 4.1358f, 16.2053f, 4.2435f)
                lineTo(16.2374f, 4.3398f)
                curveTo(16.2563f, 4.3965f, 16.2617f, 4.4125f, 16.2663f, 4.4252f)
                curveTo(16.4435f, 4.915f, 16.8799f, 5.2558f, 17.3353f, 5.3001f)
                curveTo(17.3687f, 5.3019f, 17.402f, 5.3038f, 17.435f, 5.3057f)
                curveTo(19.1115f, 5.4047f, 20.4013f, 5.6838f, 21.3588f, 6.6413f)
                curveTo(22.1071f, 7.3896f, 22.4392f, 8.3386f, 22.5969f, 9.511f)
                curveTo(22.75f, 10.6502f, 22.75f, 12.1058f, 22.75f, 13.9436f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                verticalLineTo(13.9436f)
                curveTo(1.25f, 12.1058f, 1.25f, 10.6502f, 1.4031f, 9.511f)
                curveTo(1.5608f, 8.3386f, 1.8929f, 7.3896f, 2.6412f, 6.6413f)
                curveTo(3.5987f, 5.6838f, 4.8885f, 5.4047f, 6.565f, 5.3057f)
                curveTo(6.598f, 5.3038f, 6.6313f, 5.3019f, 6.6648f, 5.3001f)
                curveTo(7.1203f, 5.2558f, 7.5571f, 4.9148f, 7.7342f, 4.4252f)
                curveTo(7.7388f, 4.4125f, 7.7441f, 4.3968f, 7.7631f, 4.3398f)
                lineTo(7.7952f, 4.2434f)
                curveTo(7.831f, 4.1358f, 7.859f, 4.0519f, 7.8902f, 3.9743f)
                curveTo(8.2865f, 2.9885f, 9.2151f, 2.3193f, 10.2755f, 2.255f)
                curveTo(10.3591f, 2.25f, 10.4474f, 2.25f, 10.561f, 2.25f)
                close()
                moveTo(6.6419f, 6.8038f)
                curveTo(6.6864f, 6.8025f, 6.7305f, 6.8f, 6.7744f, 6.7964f)
                curveTo(7.6467f, 6.7503f, 8.6972f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(15.3028f, 6.75f, 16.3533f, 6.7503f, 17.2256f, 6.7964f)
                curveTo(17.2695f, 6.8f, 17.3136f, 6.8025f, 17.3581f, 6.8038f)
                curveTo(18.9619f, 6.8995f, 19.7561f, 7.1599f, 20.2981f, 7.7019f)
                curveTo(20.4905f, 7.8943f, 20.6479f, 8.1191f, 20.775f, 8.4015f)
                curveTo(18.9479f, 9.5877f, 17.7474f, 10.3528f, 16.7365f, 10.8578f)
                curveTo(16.6701f, 10.5116f, 16.3656f, 10.25f, 16.0f, 10.25f)
                curveTo(15.5858f, 10.25f, 15.25f, 10.5858f, 15.25f, 11.0f)
                verticalLineTo(11.458f)
                curveTo(13.1306f, 12.0975f, 10.8694f, 12.0975f, 8.75f, 11.4579f)
                verticalLineTo(11.0f)
                curveTo(8.75f, 10.5858f, 8.4142f, 10.25f, 8.0f, 10.25f)
                curveTo(7.6344f, 10.25f, 7.3299f, 10.5116f, 7.2635f, 10.8578f)
                curveTo(6.2526f, 10.3528f, 5.0521f, 9.5876f, 3.225f, 8.4014f)
                curveTo(3.3522f, 8.119f, 3.5095f, 7.8943f, 3.7019f, 7.7019f)
                curveTo(4.2439f, 7.1599f, 5.0381f, 6.8995f, 6.6419f, 6.8038f)
                close()
                moveTo(2.8603f, 9.953f)
                curveTo(2.7514f, 10.9494f, 2.75f, 12.2393f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 12.2394f, 21.2486f, 10.9495f, 21.1397f, 9.9531f)
                curveTo(19.2527f, 11.1759f, 17.9585f, 11.9851f, 16.75f, 12.5046f)
                verticalLineTo(13.0f)
                curveTo(16.75f, 13.4142f, 16.4142f, 13.75f, 16.0f, 13.75f)
                curveTo(15.5913f, 13.75f, 15.2589f, 13.423f, 15.2502f, 13.0164f)
                curveTo(13.1199f, 13.578f, 10.8801f, 13.578f, 8.7498f, 13.0164f)
                curveTo(8.7411f, 13.423f, 8.4087f, 13.75f, 8.0f, 13.75f)
                curveTo(7.5858f, 13.75f, 7.25f, 13.4142f, 7.25f, 13.0f)
                verticalLineTo(12.5045f)
                curveTo(6.0415f, 11.985f, 4.7474f, 11.1758f, 2.8603f, 9.953f)
                close()
                moveTo(14.992f, 5.2509f)
                curveTo(14.6812f, 5.25f, 14.3575f, 5.25f, 14.0206f, 5.25f)
                horizontalLineTo(9.9794f)
                curveTo(9.6427f, 5.25f, 9.3191f, 5.25f, 9.0084f, 5.2509f)
                curveTo(9.0601f, 5.1486f, 9.1057f, 5.0433f, 9.1447f, 4.9354f)
                curveTo(9.1566f, 4.9025f, 9.1683f, 4.8674f, 9.1834f, 4.8223f)
                lineTo(9.1861f, 4.8141f)
                lineTo(9.2117f, 4.7372f)
                curveTo(9.2571f, 4.6012f, 9.2699f, 4.5637f, 9.282f, 4.5338f)
                curveTo(9.4621f, 4.0857f, 9.8842f, 3.7815f, 10.3662f, 3.7523f)
                curveTo(10.3984f, 3.7503f, 10.438f, 3.75f, 10.5814f, 3.75f)
                horizontalLineTo(13.4191f)
                curveTo(13.5625f, 3.75f, 13.602f, 3.7503f, 13.6343f, 3.7523f)
                curveTo(14.1163f, 3.7815f, 14.5384f, 4.0857f, 14.7185f, 4.5338f)
                curveTo(14.7306f, 4.5637f, 14.7434f, 4.6012f, 14.7887f, 4.7372f)
                lineTo(14.817f, 4.8221f)
                moveTo(14.8557f, 4.9355f)
                curveTo(14.8947f, 5.0433f, 14.9403f, 5.1486f, 14.992f, 5.2509f)
                close()
            }
        }
            .build()
        return _caseMinimalistic!!
    }

private var _caseMinimalistic: ImageVector? = null
